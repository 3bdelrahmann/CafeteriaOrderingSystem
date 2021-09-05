/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.Prototype;

/**
 *
 * @author SHIKO PC
 */
public class Burger extends MenuItem{
    

   public Burger(){
     type = "Burger";
   }

   @Override
   public void draw() {
      System.out.println("Inside Burger::draw() method.");
   }
}

