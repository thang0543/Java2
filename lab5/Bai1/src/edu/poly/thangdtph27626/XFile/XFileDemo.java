package edu.poly.thangdtph27626.XFile;

import java.io.IOException;

public class XFileDemo {

    public static void main(String[] args) {
        try {

            XFile.write("C:\\Users\\LENOVO\\Desktop\\hih.dat", "hello word".getBytes());
            byte[] data = XFile.read("C:\\Users\\LENOVO\\Desktop\\hih.dat");
            System.out.println( new String(data));
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
