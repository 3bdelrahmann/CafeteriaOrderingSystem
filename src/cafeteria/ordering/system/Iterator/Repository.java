/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.Iterator;

import cafeteria.ordering.system.Iterator.Iterator;
import cafeteria.ordering.system.Iterator.Stock1;

/**
 *
 * @author SHIKO PC
 */
public class Repository implements Stock1{
     public String names[] = {"Chicken" , "Burger" ,"Fish" };

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
      
         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }		
   }
}
