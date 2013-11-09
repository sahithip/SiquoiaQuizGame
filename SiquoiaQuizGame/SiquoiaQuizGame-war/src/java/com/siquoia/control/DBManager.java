/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.control;

import com.siquoia.exception.AuthenticationException;
import com.siquoia.exception.NotFoundException;
import com.siquoia.mapper.LeaderboardMapper;
import com.siquoia.mapper.QuizMapper;
import com.siquoia.mapper.UserMapper;
import com.siquoia.model.User;

/**
 *
 * @author PC
 */
public class DBManager {
    private static DBManager    instance;
    private UserMapper          uMapper;
    private QuizMapper          qMapper;
    private LeaderboardMapper   lMapper;
    
    private DBManager(){
        uMapper = new UserMapper();
        qMapper = new QuizMapper();
        lMapper = new LeaderboardMapper();
    }
    
    public static DBManager getInstance(){
        if(instance == null)
            instance = new DBManager();
        return instance;
    }
    
    public User getUser(String userName, String password) throws AuthenticationException{
        User user;
        try{
            user = uMapper.getUser(userName, password);
        }catch(NotFoundException nfe){
            throw new AuthenticationException("User not authenticated");
        }
        
        return user;
    }
}
