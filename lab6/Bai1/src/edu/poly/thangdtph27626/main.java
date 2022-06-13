
package edu.poly.thangdtph27626;

import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {
        MyThread Thread1 = new MyThread();
        MyThread Thread2 = new MyThread();
        
        Thread1.setPriority(Thread.MAX_PRIORITY);
        Thread2.setPriority(Thread.MIN_PRIORITY);
        Thread1.start();
        try {
            Thread1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Thread2.start();
    }
}
