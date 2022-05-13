
package com.thang.pet;


public class Ca extends Pet implements BietBoi{

    public Ca(String name) {
        super(name);
    }

    @Override
    public void boi() {
        System.out.println(name+": boi ");
    }
    
}
