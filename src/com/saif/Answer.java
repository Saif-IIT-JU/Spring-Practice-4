package com.saif;
import java.util.*;

public class Answer {
	private int id;
	private String name;
	private String date;
	
	Answer(){}
	Answer(int id, String name, String date)
	{
		this.id = id; this.name = name; this.date = date;
	}
	
	public String toString()
	{
		return id + " " + name + "  posted at " + date;
	}
}
