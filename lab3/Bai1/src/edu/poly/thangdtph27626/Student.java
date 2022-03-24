
package edu.poly.thangdtph27626;


public class Student {

   private String fullName;
   private double  poin;
   private String majors;

    public Student() {
    }

    public Student(String fullName, double poin, String majors) {
        this.fullName = fullName;
        this.poin = poin;
        this.majors = majors;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getPoin() {
        return poin;
    }

    public void setPoin(double poin) {
        this.poin = poin;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }
   
   public String getGrade(){
       if(poin < 3){
           return "kem";
       }else if(poin < 5){
           return "kem";
       }else if(poin < 6.5){
           return "Trung binh";
       }else if(poin < 7.5){
           return "kha";
       }else if(poin < 9){
           return "gioi";
       }
       return "xuất sắc";
   }
   public boolean bonus(){
       return poin > 9;
   }
}
