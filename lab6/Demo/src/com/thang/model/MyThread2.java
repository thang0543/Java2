
package com.thang.model;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MyThread2 implements Runnable{

    @Override
    public void run() {
         for(int i =5 ; i < 9; i ++){
            System.out.println(i +1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
