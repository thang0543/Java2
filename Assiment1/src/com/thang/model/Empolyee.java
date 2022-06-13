
package com.thang.model;

public class Empolyee {
    
    private String id;
    private String fullName;
    private int age;
    private String email;
    private double Wage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getWage() {
        return Wage;
    }

    public void setWage(double Wage) {
        this.Wage = Wage;
    }

    public Empolyee() {
    }

    public Empolyee(String id, String fullName, int age, String email, double Wage) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.Wage = Wage;
    }
}
