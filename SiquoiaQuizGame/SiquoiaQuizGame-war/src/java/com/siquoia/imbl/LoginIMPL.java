/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.imbl;

import com.siquoia.control.DBManager;
import com.siquoia.exception.AuthenticationException;
import com.siquoia.model.User;

/**
 *
 * @author PC
 */
public class LoginIMPL {
    DBManager manager = DBManager.getInstance();
    
    public User login(String userName, String password) throws AuthenticationException{
        User user = manager.getUser(userName, password);
        if(user.getPassword().equals(password)){
            return user;
        }
        else{
            throw new AuthenticationException("/login.jsp");
        }
    }
}
