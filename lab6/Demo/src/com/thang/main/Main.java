
package com.thang.main;

import com.thang.model.MyThread1;
import com.thang.model.MyThread2;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1(); 
        Thread th = new Thread(new MyThread2());
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        th.start();
        
    }
}
