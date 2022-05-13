    
package edu.poly.thangdtph27626;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class XFile {
    
    public static Object ObjectRead(String path){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
           Object obs = ois.readObject();
           ois.close();
            return  obs;
        } catch (IOException | ClassNotFoundException e) {
            throw  new RuntimeException(e);
        }
    }
    
    public static Object ObjectWrite(String path) throws ClassNotFoundException{
        try {
            ObjectInputStream ous = new ObjectInputStream(new FileInputStream(path));
            ous.close();
            return ous.readObject();
        } catch (IOException e) {
            throw new RuntimeException();
        }
   
    }
}
