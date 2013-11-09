/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.command;

import com.siquoia.exception.CommandException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author PC
 */
public class TargetCommand implements Command{
    protected String target;
    
    public TargetCommand(String target){
        this.target = target;
    }
    
    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        if(request.getSession().getAttribute("loggedIn")== null)
        {
            throw new CommandException("User session expired", "/login.jsp", new CommandException());
        }
    return target;
  }
    
}
