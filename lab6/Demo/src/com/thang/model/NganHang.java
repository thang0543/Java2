
package com.thang.model;

import java.util.logging.Level;
import java.util.logging.Logger;


public class NganHang {
   int soDu = 20000;   
   
   public synchronized void rutTien(int soTiencanRut) {
       System.out.println("ban dang rut tien");
       if(soTiencanRut > soDu){
           System.out.println("so du khong du");
           try {
               wait();
           } catch (InterruptedException ex) {
               Logger.getLogger(NganHang.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       soDu -= soTiencanRut;
   }
   public synchronized void  napten(int soTienNap){
       System.out.println("Ban dang nap tien...");
       soDu += soTienNap;
       System.out.println("nap tien thanh cong");
       notify();           
   }
   
}
