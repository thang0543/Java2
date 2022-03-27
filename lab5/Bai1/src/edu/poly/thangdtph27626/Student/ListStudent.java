package edu.poly.thangdtph27626.Student;

import edu.poly.thangdtph27626.XFile.XFile;
import java.util.ArrayList;
import java.util.List;

public class ListStudent {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        List<Student> list2 = (List<Student>) XFile.readObject("C:\\Users\\LENOVO\\Desktop\\students.txt");
        list.add(new Student("Tuấn", 5, "CNTT"));
        list.add(new Student("Cường", 7.5, "TKTW"));
        list.add(new Student("Hạnh", 8.5, "CNTT"));

        XFile.writeObject("C:\\Users\\LENOVO\\Desktop\\students.txt", list2);

        for (Student sv : list) {
            System.out.println("\t Họ và tên: " + sv.getName()+ "\t nganh: " + sv.getMajor()+"\t diem: "+sv.getMarks()+
                                "xep loai: " +sv.getGrade() +"co thuong" +sv.isBonus() );
           
        }
        
      
    }
}
