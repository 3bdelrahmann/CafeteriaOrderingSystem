/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.ordering.system.Iterator;

import cafeteria.ordering.system.Iterator.Iterator;

/**
 *
 * @author SHIKO PC
 */
public class IteratorPatternDemo {
     public static void main(String[] args) {
      Repository namesRepository = new Repository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      } 	
}
}
