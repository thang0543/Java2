
package edu.poly.Thangdtph27626;


public class XPoly {
    @Deprecated
    public static boolean isCardNumber(String Number){
        int n= Integer.parseInt(Number);
        int sum = 0;
        while (n > 0) {            
            int index = n%10;
            n /= 10;
            sum += index;
        }
        
        if(sum %2 ==0){
            return true;
        }else{
            return false;
        }
    }
}
