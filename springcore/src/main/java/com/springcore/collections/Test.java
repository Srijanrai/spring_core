package com.springcore.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    private static ApplicationContext context; 
	public static void main(String[] args) {
		System.out.println("Hello There!!");
		
		context = new ClassPathXmlApplicationContext("com/springcore/collections/config2.xml");
		Emp emp = (Emp)context.getBean("emp1");
		System.out.print(emp);
		System.out.println();
		
	}

}
