
package edu.poly.thangdtph27626;

import javax.swing.JTextField;



public class Random extends Thread{
    private JTextField text;

    public Random(JTextField text) {
        this.text = text;
    }
    
    @Override
    public void run() {
         for(int i = 0; i < 1000; i++){
           try {
           int random = (int)Math.round(Math.random()*9);
           text.setText(String.valueOf(random));
           Thread.sleep(10);
        } catch (InterruptedException e) {
        }
         }
       
    }
    
    
}
