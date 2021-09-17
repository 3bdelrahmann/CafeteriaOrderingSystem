/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.DAO;

import cafeteria.ordering.system.pojo.Order;
import java.util.List;

/**
 *
 * @author user
 */
public interface OrderDAO {
    Order getOrderById(int id);
    List<Order> getAllOrder();
    boolean insertOrder(Order order);
    boolean updateOrder(Order order);
    boolean deleteOrderById(int id);
    boolean deleteOrderByName(String name);
}
