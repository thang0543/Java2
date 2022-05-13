
package edu.poly.thangdtph27626;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab8Bai2 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> myarrr = new ArrayList<>();
        
        for(int i =0; i < 10; i++){
            System.out.print("nhap gia tri thu "+(i+1)+": ");
            int number = Integer.parseInt(s.nextLine());
            myarrr.add(number);
        }
         System.out.println("cac gia tri vua nhap la: ");
        for (Integer integer : myarrr) {
            System.out.print(integer +"  ");
        }
    }
    
}
