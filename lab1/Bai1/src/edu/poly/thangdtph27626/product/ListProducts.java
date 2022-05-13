
package edu.poly.thangdtph27626.product;

import java.util.ArrayList;
import java.util.Scanner;


public class ListProducts {
    
    static Scanner s = new Scanner(System.in);
    private static  ArrayList<Product> lits = new ArrayList<>();
    
    public static void main(String[] args) {
         Product pr =  new Product();
         Product pd = null;
       
         // khoi tao 5 doi tuong
        for (int i = 0; i < 5; i++) {
             pd = new Product();
               pd.inputProduct(s);
               lits.add(pd);
        }
        
        
        // khoi tao 3 doi tuong (1: khong thue, 2: co thue)
        for (int i = 0; i < 3; i++) {
           if(i!=0){
                pd = new Product();
                pd.inputProduct(s);
                
                // nếu i ==0 thì khởi tạo notaxProduct 
           }else{
               pd = new NoTaxProduct();
               pd.inputProduct(s);
           }
           //thêm vào 
           lits.add(pd);
        }
        
        // xuat 
        for(Product product : lits){
            product.outputProduct();
        }
  
           pr.select();
           pr.update();
           pr.delete();
           pr.insert();
//
    }
}
