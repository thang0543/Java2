
package edu.poly.thangdtph27626;

import java.io.Serializable;


public class DataUser implements Serializable{
    private String userName;
    private String password;
    private String role;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public DataUser() {
    }

    public DataUser(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }
    
    
}
