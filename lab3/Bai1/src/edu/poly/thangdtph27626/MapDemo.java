package edu.poly.thangdtph27626;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();

        Student sd1 = new Student();
        sd1.setFullName("Tuấn");
        sd1.setMajors("công nghệ thông tin");
        sd1.setPoin(7.0);
        map.put(sd1.getFullName(), sd1);

        Student sd2 = new Student();
        sd2.setFullName("Tèo");
        sd2.setMajors("công nghệ thông tin");
        sd2.setPoin(9.0);
        map.put(sd1.getFullName(), sd2);
        
        Student sd3 = new Student();
        sd3.setFullName("Nam");
        sd3.setMajors("công nghệ thông tin");
        sd3.setPoin(9.0);
        map.put(sd1.getFullName(), sd3);
        
        Set<String> keys = map.keySet();
        for (String name : keys) {
            Student sv = map.get(name);
            System.out.println(">Họ và tên: " + sv.getFullName());
            System.out.println(">Học lực: " + sv.getGrade());
        }
    }
}
