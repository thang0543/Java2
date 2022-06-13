
package com.thang.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Xfile {
    
    public static Object readFile(String file){
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object list = ois.readObject();
            fis.close();
            ois.close();
            return list;
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }
    
    public static void witerFile(Object data,String file){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(data);
            fos.close();
            ous.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
