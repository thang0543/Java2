
package edu.poly.thangdtph27626;


public class Staff {
    private String id;
    private String fullName;
    private String country;
    private String gender;
    private String status;

    public Staff() {
    }

    public Staff(String id, String fullName, String country, String gender, String status) {
        this.id = id;
        this.fullName = fullName;
        this.country = country;
        this.gender = gender;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
