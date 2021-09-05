package cafeteria.ordering.system.Prototype;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHIKO PC
 */
public class Chicken extends MenuItem{
    

   public Chicken(){
     type = "Chicken";
   }

   @Override
   public void draw() {
      System.out.println("Inside Chicken::draw() method.");
   }
}

