package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static ApplicationContext context ;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/ref/configref.xml");
		A a = (A)context.getBean("refa");
		System.out.print(a);

	}

}
