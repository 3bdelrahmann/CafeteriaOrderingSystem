/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.DAO;

import cafeteria.ordering.system.pojo.Manager;
import java.util.List;

public interface ManagerDAO {
	Manager getManagerById(int id);
	Manager getManagerByMail(String mail);
        Manager getManagerByMailAndPassword(String mail, String password);
	List<Manager> getAllManager();
	boolean insertManager(Manager Manager);
	boolean updateManager(Manager Manager);
	boolean deleteManagerById(int id);
	boolean deleteManagerByName(String name);
        boolean checkEmail(String email);
}
