
package com.thang.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Xfile {
    
    public static  Object ReadFile() throws IOException{
        ObjectInputStream ois ;
        FileInputStream fis ;
        try {
             fis = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\book.bin");
             ois = new ObjectInputStream(fis);
             Object ah = ois.readObject();
             fis.close();
             ois.close();
           return  ah;
        } catch (Exception e) {
             throw new RuntimeException(e);
        }
             
    }
    
    public static  void WirterFile( Object data){
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\book.bin");
            ObjectOutputStream ois = new ObjectOutputStream(fos);
            ois.writeObject(data);
            ois.close();
            fos.close();
        } catch (Exception e) {
        }
    }
    
}
