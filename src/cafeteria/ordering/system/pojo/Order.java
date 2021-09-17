/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.pojo;

public class Order {

    private String Orders_Id;
    private String Customer_Id;
    private String Payment_method;
    private String Total_price;
    private String Menu_items;

    public Order() {
    }

    public Order(String Orders_Id, String Customer_Id, String Payment_method, String Total_price, String Menu_items) {
        this.Orders_Id = Orders_Id;
        this.Customer_Id = Customer_Id;
        this.Payment_method = Payment_method;
        this.Total_price = Total_price;
        this.Menu_items = Menu_items;
    }

    public String getOrders_Id() {
        return Orders_Id;
    }

    public void setOrders_Id(String Orders_Id) {
        this.Orders_Id = Orders_Id;
    }

    public String getCustomer_Id() {
        return Customer_Id;
    }

    public void setCustomer_Id(String Customer_Id) {
        this.Customer_Id = Customer_Id;
    }

    public String getPayment_method() {
        return Payment_method;
    }

    public void setPayment_method(String Payment_method) {
        this.Payment_method = Payment_method;
    }

    public String getTotal_price() {
        return Total_price;
    }

    public void setTotal_price(String Total_price) {
        this.Total_price = Total_price;
    }

    public String getMenu_items() {
        return Menu_items;
    }

    public void setMenu_items(String Menu_items) {
        this.Menu_items = Menu_items;
    }

    @Override
    public String toString() {
        return "Order{" + "Orders_Id=" + Orders_Id + ", Customer_Id=" + Customer_Id + ", Payment_method=" + Payment_method + ", Total_price=" + Total_price + ", Menu_items=" + Menu_items + '}';
    }

}
