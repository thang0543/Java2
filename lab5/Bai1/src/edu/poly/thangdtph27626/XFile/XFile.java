package edu.poly.thangdtph27626.XFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class XFile {

    public static byte[] read(String path) throws IOException {
        FileInputStream fis;
        // Tạo luồng đầu vào.  
        try {
           fis = new FileInputStream(path);
            int length = fis.available();  // Tổng số byte còn lại khả dụng(đọc từ luồng đầu vào)
            byte[] buffer = new byte[length];
            fis.read(buffer);
            fis.close();
            return buffer;
        } catch(FileNotFoundException ex){
            throw new RuntimeException(ex);
        }
    }

    
    public static void write(String path, byte[] data) throws IOException{
        FileOutputStream fos;
        try {
           fos = new FileOutputStream(path);
            fos.write(data);
        }catch(FileNotFoundException ex){
            
        }
    }
    
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
    
    public static String  readBufferedWrite(String path, JTextArea txtcontent) throws IOException{
         BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(path));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    txtcontent.append(line);
                    txtcontent.append("\r \n");
                }
            }
             return br.readLine();
        } catch (FileNotFoundException  e) {
            throw new RuntimeException(e);
        } 
    }
    
     public static void writeBufferedWrite(String path, String data) throws IOException{
//       

        
        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(path));
            buffer.write(data);

            buffer.close();

//            txt_NoiDung.setText("");
//            txt_TenFile.setText("");
        } catch (Exception e) {
            
        }
    }

}
//
// 