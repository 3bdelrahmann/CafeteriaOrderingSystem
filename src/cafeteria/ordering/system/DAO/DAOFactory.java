/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.DAO;

import java.sql.Connection;

public abstract class DAOFactory {
    // List of DAO types supported by the factory

    public static final int MYSQL = 1;

    // There will be a method for each DAO that can be 
    // created. The concrete factories will have to 
    // implement these methods.
    public abstract CustomerDAO getCustomerDAO();
    public abstract ManagerDAO getManagerDAO();
    public abstract OrderDAO getOrderDAO();
    public abstract Menu_itemsDAO getMenu_itemsDAO();

    public static DAOFactory getDAOFactory(int whichFactory) {

        return MySqlDAOFactory.getInstance();

    }

}
