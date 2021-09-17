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
public class Manager {

    private String Manager_Id;
    private String Manager_name;
    private String Manager_phone;
    private String Manager_mail;
    private String Manager_address;
    private String Manager_password;

    public Manager() {
    }

    public Manager(String Manager_Id, String Manager_name, String Manager_phone, String Manager_mail, String Manager_address, String Manager_password) {
        super();
        this.Manager_Id = Manager_Id;
        this.Manager_name = Manager_name;
        this.Manager_phone = Manager_phone;
        this.Manager_mail = Manager_mail;
        this.Manager_address = Manager_address;
        this.Manager_password = Manager_password;
    }

    public String getManager_Id() {
        return Manager_Id;
    }

    public void setManager_Id(String Manager_Id) {
        this.Manager_Id = Manager_Id;
    }

    public String getManager_name() {
        return Manager_name;
    }

    public void setManager_name(String Manager_name) {
        this.Manager_name = Manager_name;
    }

    public String getManager_phone() {
        return Manager_phone;
    }

    public void setManager_phone(String Manager_phone) {
        this.Manager_phone = Manager_phone;
    }

    public String getManager_mail() {
        return Manager_mail;
    }

    public void setManager_mail(String Manager_mail) {
        this.Manager_mail = Manager_mail;
    }

    public String getManager_address() {
        return Manager_address;
    }

    public void setManager_address(String Manager_address) {
        this.Manager_address = Manager_address;
    }

    public String getManager_password() {
        return Manager_password;
    }

    public void setManager_password(String Manager_password) {
        this.Manager_password = Manager_password;
    }

    @Override
    public String toString() {
        return "Manager{" + "Manager_Id=" + Manager_Id + ", Manager_name=" + Manager_name + ", Manager_phone=" + Manager_phone + ", Manager_mail=" + Manager_mail + ", Manager_address=" + Manager_address + ", Manager_password=" + Manager_password + '}';
    }

}
