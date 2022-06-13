
package com.thang.control;

import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import java.util.Date;

public class clock extends Thread{
    
    private JLabel label;

    
    @Override
    public void run() {
      SimpleDateFormat date = new SimpleDateFormat("hh:mm aa");
      while(true){
          Date now = new Date();
          String clock = date.format(now);
          label.setText(clock);
          try {
              Thread.sleep(10000);
          } catch (Exception e) {
          }
      }
    }

    public JLabel getLabel() {
        return label;
    }

    public clock() {
    }

    public clock(JLabel label) {
        this.label = label;
    }
    
    
    
    
}
