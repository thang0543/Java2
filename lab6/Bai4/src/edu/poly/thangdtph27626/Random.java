
package edu.poly.thangdtph27626;

import javax.swing.JTextField;



public class Random extends Thread{
    private JTextField text;
    private  int i = 0;
    
 
    
    
    @Override
    public void run() {
         for( i = 0; i < 10000; i++){
           try {
                int random = (int)Math.round(Math.random()*9);
                text.setText(String.valueOf(random));
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
       
    }

    public Random(JTextField text) {
        this.text = text;
    }

    public int getI() {
        return i;
    }
    
    
}
