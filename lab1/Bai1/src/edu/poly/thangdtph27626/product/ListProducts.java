
package edu.poly.thangdtph27626.product;

import java.util.ArrayList;
import java.util.Scanner;


public class ListProducts {
    
    static Scanner s = new Scanner(System.in);
    private static  ArrayList<Product> lits = new ArrayList<>();
    
    public static void main(String[] args) {
         Product pd = null;
         
        for (int i = 0; i < 5; i++) {
           if(i!=0){
                pd = new Product();
                pd.inputProduct(s);
                
           }else{
               pd = new NoTaxProduct();
               pd.inputProduct(s);
           }
           lits.add(pd);
        }
        
        for(Product product : lits){
            product.outputProduct();
        }
           pd.select();
           pd.update();
           pd.delete();
           pd.insert();
    }
}
