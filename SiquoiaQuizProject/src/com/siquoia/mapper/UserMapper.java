/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.mapper;

import com.siquoia.dbconnection.DummyDB;
import com.siquoia.exception.NotFoundException;
import com.siquoia.model.Player;
import com.siquoia.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class UserMapper {
    //DUMMY DATABASE
    DummyDB db = DummyDB.getInstance();
    
    public User getUser(String userName, Connection conn){
        String SQL = "select * from users where user_name = ?";
        Player player = null;
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.prepareStatement(SQL);
            ps.setString(1, userName);
            rs = ps.executeQuery();
            if(rs.next())
                player = new Player(rs.getString(2), rs.getString(3), rs.getString(4), (long)rs.getInt(1), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
        } catch (SQLException ex) {
            Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
            try{
                conn.rollback();
            }catch(SQLException sqle){
                sqle.printStackTrace();
            }
        }
        return player;
    }
    
    public User getUser(long userId){
        return db.getUser(userId);
    }
    
    public User getUser(String userName, String password) throws NotFoundException{
        return db.getUser(userName);
    }
}
