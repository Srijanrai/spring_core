package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
     private static ApplicationContext con ; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
      Person person = (Person) con.getBean("person");
      System.out.println(person);
	}

}
