/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system;

import java.sql.Connection;

/**
 *
 * @author user
 */
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

public class MySqlMenu_itemsDAO implements Menu_itemsDAO {

    private Connection connection;

    private static MySqlMenu_itemsDAO uniqueInstance;

    private MySqlMenu_itemsDAO() {
        this.connection = MySqlDAOFactory.getConnection();
    }

    public static MySqlMenu_itemsDAO getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MySqlMenu_itemsDAO();
        }
        return uniqueInstance;
    }

    @Override
    public Menu_items getMenu_itemsById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Menu_items> getAllMenu_items() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertMenu_items(Menu_items menu_items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateMenu_items(Menu_items menu_items) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteMenu_itemsById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteMenu_itemsByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
