
package edu.poly.Thangdtph27626;

import java.util.ArrayList;


public class Lab8Bai1 {

   
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
       
        list.add(4);
        list.add(4.5);
        list.add(true);
        list.add("hello word");
        
       int a = (Integer)list.get(0);
       double b = (Double)list.get(1);
       boolean c = (Boolean)list.get(2);
       String d = (String)list.get(3);
       
        System.out.printf("%d , %f, %s, %s",a,b,c,d);
       
    }
    
}
