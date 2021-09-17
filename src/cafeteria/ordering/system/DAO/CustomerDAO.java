/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.DAO;

import cafeteria.ordering.system.pojo.Customer;
import java.util.List;

public interface CustomerDAO {
	Customer getCustomerById(int id);
	Customer getCustomerByMail(String mail);
        Customer getCustomerByMailAndPassword(String mail, String password);
	List<Customer> getAllCustomer();
	boolean insertCustomer(Customer customer);
	boolean updateCustomer(Customer customer);
	boolean deleteCustomerById(int id);
	boolean deleteCustomerByName(String name);
        boolean checkEmail(String email);
}
