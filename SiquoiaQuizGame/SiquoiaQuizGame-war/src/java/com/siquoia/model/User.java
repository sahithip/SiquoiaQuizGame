/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.model;

/**
 *
 * @author PC
 */
public abstract class User {
    private String userName;
    private String password;
    private String email;
    private long userId;
    
    public User(String userName, String password, String email, long userId){
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.userName = userName;
    }
    
    public long getUserId(){
        return userId;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public String getPassword(){
        return password;
    }
}
