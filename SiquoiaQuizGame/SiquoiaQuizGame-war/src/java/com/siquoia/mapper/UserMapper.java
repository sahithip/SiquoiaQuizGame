/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.mapper;

import com.siquoia.dummy.DummyDB;
import com.siquoia.exception.AuthenticationException;
import com.siquoia.model.User;

/**
 *
 * @author PC
 */
public class UserMapper {
    //DUMMY DATABASE
    DummyDB db = DummyDB.getInstance();
    
    public User getUser(String userName){
        return db.getUser(userName);
    }
    
    public User getUser(long userId){
        return db.getUser(userId);
    }
    
    public User login(String userName, String password) throws AuthenticationException{
        User user = db.getUser(userName);
        if(user.getPassword().equals(password)){
            return user;
        }
        else{
            throw new AuthenticationException("/login.jsp");
        }
    }
}
