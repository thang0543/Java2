
package edu.poly.thangdtph27626;


public class main {

    
    public static void main(String[] args) throws InterruptedException {
       
        OddThread ot = new OddThread();
        EvenThread et = new EvenThread();
        
        ot.start();
        ot.join();
        et.start();
    }
    
}
