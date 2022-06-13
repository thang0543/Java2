
package com.thang.main;


public class Demo {
    
    enum Mua{
        XUAN(3), HA(1), THU(213), DONG(345);
        int value;

        private Mua(int value) {
            this.value = value;
        }
        
    }
    public static void main(String[] args) {
        for(Mua m : Mua.values()){
            System.out.println(m.value);
        }
    }
}
