/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employemangment;

import java.util.ArrayList;

/**
 *
 * @author nipun
 */
public class User {
    private String name;
    private String username;
    private String password;
    private String jobTitle;

    

    public User(String name,String username,String password,String jobTitle){
        this.name =name;
        this.username=username;
        this.password=password;
        this.jobTitle = jobTitle;
    }
    
    
    public String getName(){return name;}
    public String getUsername(){return username;}
    public String getPassword(){return password;}
    public String getJobTitle(){return jobTitle;}
    public void setName(String name){
    this.name = name;
    }
    public void setUsername(String username){
    this.username = username;
    }
    public void setPassword(String password){
    this.password = password;
    }
    public void setJobTitle(String jobTitle){
    this.jobTitle = jobTitle;
    }
    
    
    
    
    @Override
    public String toString(){
        return "User{" +
                ", name='" + name + '\'' +
                ", userName='" + username + '\'' +
                ", password='" + password + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
