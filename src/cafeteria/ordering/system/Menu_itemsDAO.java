/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system;

import java.util.List;

public interface Menu_itemsDAO {
	Menu_items getMenu_itemsById(int id);
	List<Menu_items> getAllMenu_items();
	boolean insertMenu_items(Menu_items menu_items);
	boolean updateMenu_items(Menu_items menu_items);
	boolean deleteMenu_itemsById(int id);
	boolean deleteMenu_itemsByName(String name);

}
