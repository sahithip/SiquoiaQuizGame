/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.model;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Quiz extends QuizComponent{
    
    private ArrayList<Question> questions;
    
    public Quiz(){
        questions = new ArrayList<Question>();
    }
}
