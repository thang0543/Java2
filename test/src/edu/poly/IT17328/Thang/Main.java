package edu.poly.IT17328.Thang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        

        String checkEmail = "\\w+@\\w+(\\.\\w+){1,2}";

        do {
            System.out.println("nhap email cua bạn: ");
            String email = s.nextLine();
            if (email.matches(checkEmail)) {
                System.out.println("bạn da nhap dung");
                break;
            } else {
                System.out.println("lỗi");
            }
        } while (true);
    }

}
