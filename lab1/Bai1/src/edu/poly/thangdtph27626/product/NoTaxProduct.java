
package edu.poly.thangdtph27626.product;

//kế thừa lại lớp cha
public class NoTaxProduct extends Product{
    
    // ghi đè lại getImportTax(Thuế) của lớp cha
    @Override
    public double  getImportTax(){
        return 0;
    }
    
    
}
