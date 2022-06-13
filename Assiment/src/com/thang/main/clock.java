
package com.thang.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;


public class clock extends Thread{

    private JLabel lb;
    
     
    @Override
    public void run() {
        SimpleDateFormat date = new SimpleDateFormat("hh:mm aa");
        while (true) {            
            Date now = new Date();
            String st = date.format(now);
            lb.setText(st);
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
            }
        }
    }

    public clock(JLabel lb) {
        this.lb = lb;
    }
    
    
}
