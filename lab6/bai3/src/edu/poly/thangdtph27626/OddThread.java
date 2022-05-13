
package edu.poly.thangdtph27626;


public class OddThread extends Thread{

    @Override
    public void run() {
        try {
            for(int i = 1; i<= 10; i++){
                if(i %2 !=0){
                    Thread.sleep(1000);
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
        }
    }
    
}
