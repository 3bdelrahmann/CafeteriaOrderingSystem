/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.DAO;

import cafeteria.ordering.system.ui.CustomerHome;
import cafeteria.ordering.system.ui.RegisterForm;
import cafeteria.ordering.system.ui.LoginForm;
import cafeteria.ordering.system.pojo.Customer;
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

public class MySqlCustomerDAO implements CustomerDAO {

    private Connection connection;

    private static MySqlCustomerDAO uniqueInstance;

    private MySqlCustomerDAO() {
        this.connection = MySqlDAOFactory.getConnection();
    }

    public static MySqlCustomerDAO getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MySqlCustomerDAO();
        }
        return uniqueInstance;
    }

    @Override
    public Customer getCustomerById(int id) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM `customer` WHERE Customer_Id = " + id);

            if (res.next()) {
                Customer customer = new Customer();
                customer.setId(res.getString("Customer_Id"));
                customer.setName(res.getString("Customer_Name"));
                customer.setPhone(res.getString("Customer_phone"));
                customer.setMail(res.getString("Customer_mail"));
                customer.setAddress(res.getString("Customer_address"));
                customer.setPassword(res.getString("Customer_password"));
                return customer;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Customer getCustomerByMail(String mail) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM `customer` WHERE Customer_mail = " + mail);

            if (res.next()) {
                Customer customer = new Customer();
                customer.setId(res.getString("Customer_Id"));
                customer.setName(res.getString("Customer_Name"));
                customer.setPhone(res.getString("Customer_phone"));
                customer.setMail(res.getString("Customer_mail"));
                customer.setAddress(res.getString("Customer_address"));
                customer.setPassword(res.getString("Customer_password"));
                return customer;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Customer> getAllCustomer() {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM `customer`");

            List<Customer> customers = new ArrayList<>();

            while (res.next()) {
                Customer customer = new Customer();
                customer.setId(res.getString("Customer_Id"));
                customer.setName(res.getString("Customer_Name"));
                customer.setPhone(res.getString("Customer_phone"));
                customer.setMail(res.getString("Customer_mail"));
                customer.setAddress(res.getString("Customer_address"));
                customer.setPassword(res.getString("Customer_password"));
                customers.add(customer);
            }
            return customers;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insertCustomer(Customer customer) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO `customer`(`Customer_Id`, `Customer_name`, `Customer_phone`, `Customer_mail`, `Customer_address`, `Customer_password`) VALUES (?,?,?,?,?,?)");
            statement.setString(1, customer.getId());
            statement.setString(2, customer.getName());
            statement.setString(3, customer.getPhone());
            statement.setString(4, customer.getMail());
            statement.setString(5, customer.getAddress());
            statement.setString(6, customer.getPassword());
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
    public boolean updateCustomer(Customer customer) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteCustomerById(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteCustomerByName(String name) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Customer getCustomerByMailAndPassword(String mail, String password) {

        try {
            PreparedStatement ps;
            ResultSet rs;

            String query = "SELECT * FROM `customer` WHERE `Customer_mail` =? AND `Customer_password` =?";

            ps = MyConnection.getConnection().prepareStatement(query);

            ps.setString(1, mail);
            ps.setString(2, password);

            rs = ps.executeQuery();
            MySqlManagerDAO mng = new MySqlManagerDAO();
            if (rs.next()) {
                CustomerHome mf = new CustomerHome();
                LoginForm lf = new LoginForm();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                mf.jLabel1.setText("Welcome  " + mail);
                lf.dispose();

            } else {
                mng.getManagerByMailAndPassword(mail, password);
//                JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public boolean checkEmail(String email) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `customer` WHERE `Customer_mail` =?";

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, email);

            rs = ps.executeQuery();

            if (rs.next()) {
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUser;
    }

}
