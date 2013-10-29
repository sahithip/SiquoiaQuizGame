/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.command;

import com.siquoia.control.DBManager;
import com.siquoia.exception.AuthenticationException;
import com.siquoia.exception.CommandException;
import com.siquoia.model.Player;
import com.siquoia.model.User;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author PC
 */
public class LoginCommand extends TargetCommand{
    
    private DBManager manager = DBManager.getInstance();

    public LoginCommand(String target) {
        super(target);
    }

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        User user;
        try{
           user = manager.login(userName, password);
        }
        catch(AuthenticationException ae){
            throw new CommandException("Login Command", ae.getMessage(), ae);
        }
        
        request.setAttribute("userId", user.getUserId());
        request.setAttribute("userName", user.getUserName());
        
        return super.execute(request);
    }
    
}
