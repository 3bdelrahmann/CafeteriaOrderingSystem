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

public class MySqlManagerDAO implements ManagerDAO {

    private Connection connection;

    private static MySqlManagerDAO uniqueInstance;

    MySqlManagerDAO() {
        this.connection = MySqlDAOFactory.getConnection();
    }

    public static MySqlManagerDAO getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MySqlManagerDAO();
        }
        return uniqueInstance;
    }

    @Override
    public Manager getManagerById(int id) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM `manager` WHERE Manager_Id = " + id);

            if (res.next()) {
                Manager manager = new Manager();
                manager.setManager_Id(res.getString("Manager_Id"));
                manager.setManager_name(res.getString("Manager_Name"));
                manager.setManager_phone(res.getString("Manager_phone"));
                manager.setManager_mail(res.getString("Manager_mail"));
                manager.setManager_address(res.getString("Manager_address"));
                manager.setManager_password(res.getString("Manager_password"));
                return manager;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Manager getManagerByMail(String mail) {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM `manager` WHERE Manager_mail = " + mail);

            if (res.next()) {
                Manager manager = new Manager();
                manager.setManager_Id(res.getString("Manager_Id"));
                manager.setManager_name(res.getString("Manager_Name"));
                manager.setManager_phone(res.getString("Manager_phone"));
                manager.setManager_mail(res.getString("Manager_mail"));
                manager.setManager_address(res.getString("Manager_address"));
                manager.setManager_password(res.getString("Manager_password"));
                return manager;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Manager> getAllManager() {
        try {
            Statement statement = connection.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM `manager`");

            List<Manager> managers = new ArrayList<>();

            while (res.next()) {
                Manager manager = new Manager();
                manager.setManager_Id(res.getString("Manager_Id"));
                manager.setManager_name(res.getString("Manager_Name"));
                manager.setManager_phone(res.getString("Manager_phone"));
                manager.setManager_mail(res.getString("Manager_mail"));
                manager.setManager_address(res.getString("Manager_address"));
                manager.setManager_password(res.getString("Manager_password"));
                managers.add(manager);
            }
            return managers;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insertManager(Manager manager) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO `manager`(`Manager_Id`, `Manager_name`, `Manager_phone`, `Manager_mail`, `Manager_address`, `Manager_password`) VALUES (?,?,?,?,?,?)");
            statement.setString(1, manager.getManager_Id());
            statement.setString(2, manager.getManager_name());
            statement.setString(3, manager.getManager_phone());
            statement.setString(4, manager.getManager_mail());
            statement.setString(5, manager.getManager_address());
            statement.setString(6, manager.getManager_password());
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
    public boolean updateManager(Manager manager) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteManagerById(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteManagerByName(String name) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Manager getManagerByMailAndPassword(String mail, String password) {

        try {
            PreparedStatement ps;
            ResultSet rs;

            String query = "SELECT * FROM `manager` WHERE `Manager_mail` =? AND `Manager_password` =?";

            ps = MyConnection.getConnection().prepareStatement(query);

            ps.setString(1, mail);
            ps.setString(2, password);

            rs = ps.executeQuery();

            if (rs.next()) {
                ManagerHome mf = new ManagerHome();
                LoginForm lf = new LoginForm();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                lf.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
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
        String query = "SELECT * FROM `manager` WHERE `Manager_mail` =?";

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
