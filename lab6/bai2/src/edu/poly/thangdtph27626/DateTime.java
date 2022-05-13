
package edu.poly.thangdtph27626;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;


public class DateTime extends Thread{
    private JButton button;

    public DateTime(JButton button) {
        this.button = button;
    }

    @Override
    public void run(){
        SimpleDateFormat date = new SimpleDateFormat("hh:mm:ss aa");
        
        while(true){
            Date now = new Date();
            String time = date.format(now);
            button.setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        
    }
}
