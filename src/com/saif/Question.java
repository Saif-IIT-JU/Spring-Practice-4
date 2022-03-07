package com.saif;

import java.util.*;

public class Question {
	private int id;
	private String name;
	private Map<Answer, User>ans;
	
	Question(){}
	Question(int id, String name, Map<Answer, User>ans)
	{
		this.id = id; this.name = name; this.ans = ans;
	}
	
	public void display()
	{
		System.out.println("Qustion id : " + this.id);
		System.out.println("Question is : " + this.name);
		System.out.println("Answers are... ");
		
		Iterator itr = ans.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry e = (Map.Entry)itr.next();
			Answer a = (Answer)e.getKey(); User u = (User)e.getValue();
			System.out.println(a.toString() + "   posted by " + u.toString());
		}
	}
}
