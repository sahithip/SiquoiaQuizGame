package com.siquoia.impl;

import java.util.ArrayList;

import com.siquoia.control.DBManager;
import com.siquoia.mapper.QuizMapper;
import com.siquoia.model.Category;
import com.siquoia.model.Question;

public class QuestionImpl {
	
	DBManager manager = DBManager.getInstance();
	QuizMapper   qMapper = new QuizMapper();
	
	public ArrayList<Category> selectCategory()
	{
		ArrayList<Category> categoryList = new ArrayList<>();
		categoryList = qMapper.selectCategory();
    	return categoryList;
	}

	public boolean addQue(String userType,Question question)
	{
		boolean flag = false;
		flag = qMapper.addQue(userType, question);
		return flag;
	}
}
