package com.saif;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	
		Question Q = (Question)context.getBean("q1");
	
		Q.display();
	}
}
