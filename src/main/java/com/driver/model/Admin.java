package com.driver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;

    private String username;
    private String password;

    //constructor
    public Admin(){
        //no args constructor
    }
    public Admin(int adminId , String username , String password){
        //all args constructor
        this.adminId=adminId;
        this.username = username;
        this.password = password;
    }
    public Admin(String username , String password){
        //all args constructor
        this.username = username;
        this.password = password;
    }

    //setter and getter
    public void setAdminId(int adminId){
        this.adminId=adminId;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public int getAdminId(){
        return adminId;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

}