
package edu.poly.thangdtph27626.product;

import java.util.Scanner;


public class Product implements Dao{

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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

     public double getImportTax() {
        return price * 0.1;
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

   
    // ghi đè lại các function của lớp Dao 
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
