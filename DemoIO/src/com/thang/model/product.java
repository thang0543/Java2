
package com.thang.model;

import java.io.Serializable;


public class product implements Serializable{
    private String Ma;
    private String name;
    private Double price;

    public product(String Ma, String name, Double price) {
        this.Ma = Ma;
        this.name = name;
        this.price = price;
    }

    public product() {
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
    
}
