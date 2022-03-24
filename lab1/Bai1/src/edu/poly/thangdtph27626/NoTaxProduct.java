
package edu.poly.thangdtph27626;


public class NoTaxProduct extends Product{
    
    @Override
    public double  getImportTax(){
        return 0;
    }
    
}
