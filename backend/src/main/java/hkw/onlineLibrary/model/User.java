package hkw.onlineLibrary.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Integer userId;
    @Column
    private String phoneNumber;
    @Column
    private String Password;
    @Column
    private String UserName;
    @Column
    private Date RegistrationTime;
    @Column
    private Date LastLoginTime;

    public Integer getUserId(){
        return userId;
    }
    public void setUserId(Integer userId){
        this.userId = userId;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPassword(){
        return Password;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
    public String getUserName(){
        return UserName;
    }
    public void setUserName(String UserName){
        this.UserName = UserName;
    }
    @PrePersist
    protected void onCreate() {
        RegistrationTime = new Date();  
    }

    @PreUpdate
    protected void onUpdate() {
        LastLoginTime = new Date();
    }
    public Date getRegistrationTime(){
        return RegistrationTime;
    }
    
}
