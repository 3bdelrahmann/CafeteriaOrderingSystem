/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.pojo;

public class Customer {

    private String Customer_Id;
    private String Customer_name;
    private String Customer_phone;
    private String Customer_mail;
    private String Customer_address;
    private String Customer_password;

    public Customer() {
    }

    public Customer(String Customer_Id, String Customer_name, String Customer_phone, String Customer_mail, String Customer_address, String Customer_password) {
        super();
        this.Customer_Id = Customer_Id;
        this.Customer_name = Customer_name;
        this.Customer_phone = Customer_phone;
        this.Customer_mail = Customer_mail;
        this.Customer_address = Customer_address;
        this.Customer_password = Customer_password;
    }

    public String getId() {
        return Customer_Id;
    }

    public void setId(String Customer_Id) {
        this.Customer_Id = Customer_Id;
    }

    public String getName() {
        return Customer_name;
    }

    public void setName(String Customer_name) {
        this.Customer_name = Customer_name;
    }

    public String getPhone() {
        return Customer_phone;
    }

    public void setPhone(String Customer_phone) {
        this.Customer_phone = Customer_phone;
    }

    public String getAddress() {
        return Customer_address;
    }

    public void setAddress(String Customer_address) {
        this.Customer_address = Customer_address;
    }

    public String getPassword() {
        return Customer_password;
    }

    public void setPassword(String Customer_password) {
        this.Customer_password = Customer_password;
    }

    public String getMail() {
        return Customer_mail;
    }

    public void setMail(String Customer_mail) {
        this.Customer_mail = Customer_mail;
    }

    @Override
    public String toString() {
        return "Name: " + this.Customer_name + ", Phone: " + this.Customer_phone + ", Address: " + this.Customer_address;
    }

}
