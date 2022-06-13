
package com.thang.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        for(int i =0 ; i < 5; i ++){
            System.out.println(i +1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        super.run();
    }
    
    
}
