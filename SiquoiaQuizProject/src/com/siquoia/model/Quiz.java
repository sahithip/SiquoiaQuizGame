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
    
    private int userId;
    private int noOfCorrectAns;
    private String userName;
    private int quizId;
    private int categoryId;
    
    public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}




	public int getUserId() {
		return userId;
	}




	public void setUserId(int userId) {
		this.userId = userId;
	}




	public int getNoOfCorrectAns() {
		return noOfCorrectAns;
	}




	public void setNoOfCorrectAns(int noOfCorrectAns) {
		this.noOfCorrectAns = noOfCorrectAns;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public int getQuizId() {
		return quizId;
	}




	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}




	public int getCategoryId() {
		return categoryId;
	}




	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}




	public Quiz(){
        questions = new ArrayList<Question>();
    }
}
