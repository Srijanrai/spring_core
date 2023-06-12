package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   private static ApplicationContext con ; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     con =  new ClassPathXmlApplicationContext("com/springcore/standalone/configref.xml");
     Person p1 = con.getBean("p1",Person.class) ;
     System.out.println(p1);
	}

}
