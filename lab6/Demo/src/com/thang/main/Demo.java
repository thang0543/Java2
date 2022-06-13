
package com.thang.main;

import com.thang.model.NganHang;

public class Demo {
    public static void main(String[] args) {
        NganHang nh = new NganHang();
        
        Thread th1 = new Thread(){
            @Override
            public void run() {
                nh.rutTien(23000);
            }
        };
        th1.start();
        Thread th2 = new Thread(){

            @Override
            public void run() {
                nh.napten(5000);
            }
        };
        th2.start();
    }
}
