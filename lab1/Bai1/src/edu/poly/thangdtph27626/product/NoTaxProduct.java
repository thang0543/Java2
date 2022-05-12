
package edu.poly.thangdtph27626.product;


public class NoTaxProduct extends Product{
    
    @Override
    public double  getImportTax(){
        return 0;
    }
    
    
}
