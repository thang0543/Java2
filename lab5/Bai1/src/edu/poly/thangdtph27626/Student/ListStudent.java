package edu.poly.thangdtph27626.Student;

import edu.poly.thangdtph27626.XFile.XFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListStudent {

    public static void main(String[] args) throws IOException {
        List<Student> list = new ArrayList<>();
        List<Student> list2 =  (List<Student>) XFile.readObject("C:\\Users\\LENOVO\\Desktop\\students.txt");
        list.add(new Student("Tuấn", 5, "CNTT"));
        list.add(new Student("Cường", 7.5, "TKTW"));
        list.add(new Student("Hạnh", 8.5, "CNTT"));

        XFile.writeObject("C:\\Users\\LENOVO\\Desktop\\students.txt", list);
         
        for (Student sv : list) {
            System.out.printf("Họ và tên: %-20s nganh: %-20s  diem: %-5.2f xep loai: %-15s co thuong: %-5s \n" ,
                              sv.getName(), sv.getMajor(), sv.getMarks(), sv.getGrade(), sv.isBonus());
           
        }
        
      
    }
}
