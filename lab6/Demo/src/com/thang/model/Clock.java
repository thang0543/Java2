
package com.thang.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.print.SimpleDoc;
import javax.swing.JLabel;


public class Clock extends Thread{
    private JLabel label;

    @Override  
    public void run(){
        SimpleDateFormat date = new SimpleDateFormat("hh:mm:ss aa");
        Date now = new Date();
        String txt = date.format(now);
        label.setText(txt);
    }
    
    public JLabel getLabel() {
        return label;
    }

   
}
