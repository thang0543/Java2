    
package com.thang.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class XFile {
    
     public static Object readObject(String path) throws IOException{
         ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream(path));
            return ois.readObject();
        }catch(IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }finally{
             ois.close();
        }
    }

    public  static void writeObject(String path, Object data){
        ObjectOutputStream ous;
        
        try {
            ous = new ObjectOutputStream(new FileOutputStream(path)) ;
            ous.writeObject(data);
            ous.close();
        } catch (IOException e) {
        }
    }
}
