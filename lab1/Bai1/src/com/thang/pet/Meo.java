
package com.thang.pet;


public class Meo  extends Pet implements BietChay{

    public Meo(String name) {
        super(name);
    }

   
    @Override
    public void chay() {
        System.out.println(name+ "chay nhanh");
    }
}