package com.saif;

import java.util.*;
public class User {
	private int id;
	private String name;
	private String email;
	
	User(){}
	User(int id, String name, String email)
	{
		this.id = id; this.name = name; this.email = email;
	}
	
	public String toString()
	{
		return "Id: " + id + "  Name: " + name + " email id: " + email;
	}
}
