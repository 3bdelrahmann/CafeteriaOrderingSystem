/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.pojo;

/**
 *
 * @author user
 */
public class Menu_items {

    private String MenuItem_Id;
    private String MenuItem_name;
    private String MenuItem_Type;
    private String MenuItem_price;

    public Menu_items() {

    }

    public Menu_items(String MenuItem_Id, String MenuItem_name, String MenuItem_Type, String MenuItem_price) {
        this.MenuItem_Id = MenuItem_Id;
        this.MenuItem_name = MenuItem_name;
        this.MenuItem_Type = MenuItem_Type;
        this.MenuItem_price = MenuItem_price;
    }

    public String getMenuItem_Id() {
        return MenuItem_Id;
    }

    public void setMenuItem_Id(String MenuItem_Id) {
        this.MenuItem_Id = MenuItem_Id;
    }

    public String getMenuItem_name() {
        return MenuItem_name;
    }

    public void setMenuItem_name(String MenuItem_name) {
        this.MenuItem_name = MenuItem_name;
    }

    public String getMenuItem_Type() {
        return MenuItem_Type;
    }

    public void setMenuItem_Type(String MenuItem_Type) {
        this.MenuItem_Type = MenuItem_Type;
    }

    public String getMenuItem_price() {
        return MenuItem_price;
    }

    public void setMenuItem_price(String MenuItem_price) {
        this.MenuItem_price = MenuItem_price;
    }

    @Override
    public String toString() {
        return "Menu_items{" + "MenuItem_Id=" + MenuItem_Id + ", MenuItem_name=" + MenuItem_name + ", MenuItem_Type=" + MenuItem_Type + ", MenuItem_price=" + MenuItem_price + '}';
    }

}
