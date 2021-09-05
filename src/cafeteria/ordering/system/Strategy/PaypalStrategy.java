/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.Strategy;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        JOptionPane.showMessageDialog(null, amount + " paid using Paypal", "Done!", 2);

    }

}
