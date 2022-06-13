
package com.thang.model;

import java.io.Serializable;


public class Student implements Serializable{
    private String name;
    private String boMOn;
    private double mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoMOn() {
        return boMOn;
    }

    public void setBoMOn(String boMOn) {
        this.boMOn = boMOn;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Student() {
    }

    public Student(String name, String boMOn, double mark) {
        this.name = name;
        this.boMOn = boMOn;
        this.mark = mark;
    }
    
    public String KQ(){
        if(mark >= 5){
            return "do";
        }else{
            return "truot";
        }
    }
}
