/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MySqlOrderDAO implements OrderDAO {

    private Connection connection;

    private static MySqlOrderDAO uniqueInstance;

    private MySqlOrderDAO() {
        this.connection = MySqlDAOFactory.getConnection();
    }

    public static MySqlOrderDAO getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MySqlOrderDAO();
        }
        return uniqueInstance;
    }

    @Override
    public Order getOrderById(int id) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM `orders` WHERE `Orders_Id` = " + id);

            if (res.next()) {
                Order order = new Order();
                order.setOrders_Id(res.getString("Orders_Id"));
                order.setCustomer_Id("Customer_Id");
                order.setMenu_items("Menu_items");
                order.setPayment_method("Payment_method");
                order.setTotal_price("Total_price");
                return order;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Order> getAllOrder() {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM `customer`");

            List<Order> orders = new ArrayList<>();

            while (res.next()) {
                Order order = new Order();
                order.setOrders_Id(res.getString("Orders_Id"));
                order.setCustomer_Id(res.getString("Customer_Id"));
                order.setMenu_items(res.getString("Menu_items"));
                order.setPayment_method(res.getString("Payment_method"));
                order.setTotal_price(res.getString("Total_price"));
                orders.add(order);
            }
            return orders;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insertOrder(Order order) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO `orders`(`Orders_Id`, `Customer_Id`, `Payment_method`, `Total_price`, `Menu_items`) VALUES (?,?,?,?,?)");
            statement.setString(1, order.getOrders_Id());
            statement.setString(2, order.getCustomer_Id());
            statement.setString(3, order.getPayment_method());
            statement.setString(4, order.getTotal_price());
            statement.setString(5, order.getMenu_items());

            int res = statement.executeUpdate();
            if (res == 1) {
                return true;
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteOrderById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteOrderByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
