/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system;

import java.util.List;

/**
 *
 * @author user
 */
public class MenuModel {
    int id ;
    String name,description;
    List <Menu_items> menuitems ;
    public MenuModel(int id, String name, String description,List<Menu_items> menuitems) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.menuitems=menuitems;
    }

    public MenuModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Menu_items> getMenuitems() {
        return menuitems;
    }

    public void setMenuitems(List<Menu_items> menuitems) {
        this.menuitems = menuitems;
    }
    
}
