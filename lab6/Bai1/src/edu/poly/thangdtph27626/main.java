
package edu.poly.thangdtph27626;

public class main {
    public static void main(String[] args) {
        MyThread Thread1 = new MyThread();
        MyThread Thread2 = new MyThread();
        
        Thread1.setPriority(Thread.MAX_PRIORITY);
        Thread2.setPriority(Thread.MIN_PRIORITY);
        Thread1.start();
        Thread2.start();
    }
}
