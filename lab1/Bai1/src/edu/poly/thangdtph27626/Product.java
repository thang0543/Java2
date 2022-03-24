/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.poly.thangdtph27626;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Product extends DAO{

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getImportTax() {
        return price * 0.1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void inputProduct(Scanner s) {
        System.out.print("nhap ten san pham: ");
        name = s.nextLine();
        System.out.print("nhap gia san pham: ");
        price = Double.parseDouble(s.nextLine());
    }

    public void outputProduct() {
        System.out.printf("ten san pham: %s \t gia: %.2f \t thue: %.2f \n",name,price,getImportTax() );
    }

    @Override
    public void insert() {
        System.out.println("chen thanh cong ");
    }
    @Override
    public void update() {
        System.out.println("cap nhat thanh cong");
    }

    @Override
    public void delete() {
        System.out.println("xoa thanh cong");
    }

    @Override
    public void select() {
        System.out.println("lua chon cua ban");
    }
    
    

}
