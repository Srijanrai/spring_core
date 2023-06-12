package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 private static ApplicationContext context ; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
      Person p = (Person)context.getBean("person1");
      System.out.print(p);
	}

}
