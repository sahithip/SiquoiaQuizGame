/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.mapper;

import com.siquoia.dbconnection.DummyDB;
import com.siquoia.exception.NotFoundException;
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
    
    public User getUser(String userName, String password) throws NotFoundException{
        return db.getUser(userName);
    }
}
