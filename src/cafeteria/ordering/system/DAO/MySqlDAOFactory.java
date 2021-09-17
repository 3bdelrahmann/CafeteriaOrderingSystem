package cafeteria.ordering.system.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDAOFactory extends DAOFactory {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/cafedb";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "";

    private static MySqlDAOFactory uniqueInstance;

    private MySqlDAOFactory() {
//		try {
//			//Class.forName(DRIVER);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
    }

    public static MySqlDAOFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MySqlDAOFactory();
        }
        return uniqueInstance;
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public CustomerDAO getCustomerDAO() {
        return MySqlCustomerDAO.getInstance();
    }

    @Override
    public ManagerDAO getManagerDAO() {
        return MySqlManagerDAO.getInstance();
    }

    @Override
    public OrderDAO getOrderDAO() {
        return MySqlOrderDAO.getInstance();
    }

    @Override
    public Menu_itemsDAO getMenu_itemsDAO() {
        return MySqlMenu_itemsDAO.getInstance();
    }

}
