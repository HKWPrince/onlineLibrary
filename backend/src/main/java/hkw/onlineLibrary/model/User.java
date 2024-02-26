package hkw.onlineLibrary.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class User {
    @Id
    @Column
    private String phoneNumber;
    @Column
    private String password;
    @Column
    private String userName;
    @Column
    private String registrationTime;
    @Column
    private String lastLoginTime;

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getRegistrationTime(){
        return registrationTime;
    }
    public void setRegistrationTime(String registrationTime){
        this.registrationTime = registrationTime;
    }
    public String getLastLoginTime(){
        return lastLoginTime;
    }
    public void setLastLoginTime(String lastLoginTime){
        this.lastLoginTime = lastLoginTime;
    }
}
