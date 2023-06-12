package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext context;
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
  
		 context =  new ClassPathXmlApplicationContext("com/springcore/springcore/config.xml");
		
        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");      
        System.out.println(student1);
        System.out.print(student2);
    }
}
