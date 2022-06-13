
package edu.poly.thangdtph27626;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class XDate {
    
    public static Date parse(String text) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");      
        return sdf.parse(text);
    }
    
     public static Date parse(String text, String parse) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(parse);      
        return sdf.parse(text);
    }
     
}
