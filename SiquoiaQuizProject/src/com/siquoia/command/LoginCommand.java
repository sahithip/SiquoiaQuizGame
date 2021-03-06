/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.command;

import com.siquoia.exception.AuthenticationException;
import com.siquoia.exception.CommandException;
import com.siquoia.impl.LoginImpl;
import com.siquoia.model.User;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author PC
 */
public class LoginCommand extends TargetCommand{
    
    private LoginImpl loginIMPL;

    public LoginCommand(String target) {
        super(target);
        loginIMPL = new LoginImpl();
    }

    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        User user;
        try{
           user = loginIMPL.login(userName, password);
        }
        catch(AuthenticationException ae){
            request.getSession().removeAttribute("loggedIn");
            throw new CommandException("Login Command", ae.getMessage(), ae);
        }
        
        request.getSession().setAttribute("loggedIn", user);
        
        return super.execute(request);
    }
    
}
