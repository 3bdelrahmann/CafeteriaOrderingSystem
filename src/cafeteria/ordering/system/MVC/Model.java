package cafeteria.ordering.system.MVC;

import cafeteria.ordering.system.Customer;
import cafeteria.ordering.system.CustomerDAO;
import cafeteria.ordering.system.DAOFactory;
import java.util.List;

public class Model extends java.util.Observable {

    private int counter;
    private int refs;

    // Create DAO Factory
    DAOFactory factory;
    //=============================== User DAO ==============================================
    CustomerDAO userDAO;
    // Create User DAO

    public Model() {

        factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        userDAO = factory.getCustomerDAO();

    }

    public void setValue(int value) {
        refs = 1325 + (int) (Math.random() * 4238);
        this.counter = value;
        setChanged();
        notifyObservers(refs);
    }

    public void GenerateReports() {
        refs = 1325 + (int) (Math.random() * 4238);

        List<Customer> customers = userDAO.getAllCustomer();
        for (Customer customer : customers) {
//            notifyObservers(customer);
        }

        counter++;
        System.out.println("Number Of reports = " + counter);
        setChanged();
        notifyObservers(refs);
    }

}
