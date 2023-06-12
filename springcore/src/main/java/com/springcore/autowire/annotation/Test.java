package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static ApplicationContext con; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		con = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/awconfig.xml");
		Emp emp = (Emp)con.getBean("emp");
		System.out.println(emp);
	}

}
