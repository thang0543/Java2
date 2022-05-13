
package com.thang.pet;


public class Vit extends Pet implements BietBoi,BietChay{

    public Vit(String name) {
        super(name);
    }

    @Override
    public void boi() {
       System.out.println(name+": boi ");
    }

    @Override
    public void chay() {
         System.out.println(name+ "chay nhanh");
    }
    
}
