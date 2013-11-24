package com.siquoia.command;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.Session;

import com.siquoia.exception.CommandException;
import com.siquoia.impl.QuestionImpl;
import com.siquoia.model.Category;
import com.siquoia.model.Question;

public class QuestionCommand extends TargetCommand{
	
	private QuestionImpl questionImpl;

	public QuestionCommand(String target) {
		super(target);
		questionImpl = new QuestionImpl();
		// TODO Auto-generated constructor stub
	}

	public String execute(HttpServletRequest request) throws CommandException {
		
		ArrayList<Category> categoryList = new ArrayList<>();
		Question questionObj= new Question();
		boolean flag = false;
		
		categoryList = questionImpl.selectCategory();
		String userType = request.getParameter("userType");
		String question = request.getParameter("question");
		questionObj.setQuestion(question);
		flag = questionImpl.addQue(userType, questionObj);
		
		request.setAttribute("categoryList",categoryList);
	
		for(int i=0; i< categoryList.size() ; i++)
		{
			System.out.println("i:"+(categoryList.get(i).getCategoryName()));
			
		}
		
		return super.execute(request);
	}
	
	/*public Category selectCategory()
	{
		Category category = questionImpl.selectCategory();
		
		return category;
	}*/
	
}
