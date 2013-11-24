/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.siquoia.dbconnection.DBConnection;
import com.siquoia.model.Category;
import com.siquoia.model.Question;
import com.siquoia.model.Quiz;
import com.siquoia.model.QuizComponent;

/**
 *
 * @author PC
 */
public class QuizMapper {
    
	DBConnection dbConnection = new DBConnection();
    //TODO: Implement get -and set methods for this class
	public ArrayList<Category> selectCategory()
	{
		
		ArrayList<Category> categoryList = new ArrayList<>();
		Connection con = null;
		PreparedStatement statement = null;
		
		con = dbConnection.getConnection();
		try
		{
			statement = con.prepareStatement("select * from category");
			ResultSet resultSet= statement.executeQuery();
			while(resultSet.next())
			{
				Category category = new Category();
				category.setCategoryId(Integer.parseInt(resultSet.getString("category_id")));
				category.setParentId(Integer.parseInt(resultSet.getString("parent_id")));
				category.setCategoryName(resultSet.getString("name"));
				categoryList.add(category);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			dbConnection.closeConnection(con);
			dbConnection.closeStatement(statement);
		}
		return categoryList;
	}
	

	public boolean addQue(String userType,Question question)
	{
		boolean flag = false;
		Connection con = null;
		PreparedStatement statement=null;
		
		con = dbConnection.getConnection();
		try
		{
			
				statement = con.prepareStatement("insert into question(category_id, question, option1, option2,option3,correct_option,que_varified) values(?,?,?,?,?,?,?)");
				statement.setInt(1, question.getCategoryId());
				statement.setString(2, question.getQuestion());
				statement.setString(3, question.getOption1());
				statement.setString(4, question.getOption2());
				statement.setString(5, question.getOption3());
				statement.setString(6, question.getCorrectOption());
				if(userType.equalsIgnoreCase("user"))
				{
				statement.setString(7, "unverified");
				}
				if(userType.equalsIgnoreCase("admin"))
				{
				statement.setString(7, "verified");
				}
				
				int check = statement.executeUpdate();
				
				if(check>0)
				{
					flag = true;
				}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return flag;
	}


	public ArrayList<Question> selectUnverifiedQue()
	{
		ArrayList<Question> questionList = new ArrayList<>();
		Connection con = null;
		PreparedStatement statement = null;
		
		con=dbConnection.getConnection();
		try 
		{
			statement = con.prepareStatement("select * from question where question_verified = ?");
			statement.setString(1, "unverified");
			
			ResultSet result = statement.executeQuery();
			while(result.next())
			{
				Question question = new Question();
				question.setQuestionId(Integer.parseInt(result.getString("question_id")));
				question.setCategoryId(Integer.parseInt(result.getString("category_id")));
				question.setQuestion(result.getString("question"));
				question.setOption1(result.getString("option1"));
				question.setOption2(result.getString("option2"));
				question.setOption3(result.getString("option3"));
				question.setCorrectOption(result.getString("correct_option"));
				question.setQueVerified(result.getString("que_vrified"));
				questionList.add(question);
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return questionList;
	}
	
	public boolean verifyQue(String QueId[])
	{
		boolean flag = false;
		Connection con = null;
		PreparedStatement statement=null;
		
		con = dbConnection.getConnection();
		
		try 
		{
			for(int i=0; i< QueId.length;i++)
			{
				statement = con.prepareStatement("update question set que_verified =? where question_id = ? ");
				statement.setString(1, "verified");
				statement.setInt(2, Integer.parseInt(QueId[i]));
				
				int check = statement.executeUpdate();
				
				if(check>0)
				{
					flag = true;
				}
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	public ArrayList<Quiz> viewSubmittedResult()
	{
		ArrayList<Quiz> quizList = new ArrayList<>();
		Connection con = null;
		PreparedStatement statement = null;
		
		con = dbConnection.getConnection();
		try
		{
			statement = con.prepareStatement("select * from quiz where user_id != ?");
			statement.setString(1, null);
			
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next())
			{
				Quiz quiz = new Quiz();
				quiz.setQuizId(Integer.parseInt(resultSet.getString("quiz_id")));
				quiz.setUserId(Integer.parseInt(resultSet.getString("user_id")));
				quiz.setNoOfCorrectAns(Integer.parseInt(resultSet.getString("correct_answers")));
				quiz.setUserName(resultSet.getString("name"));
				quiz.setCategoryId(Integer.parseInt(resultSet.getString("category_id")));
				quizList.add(quiz);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return quizList;
	}

}
