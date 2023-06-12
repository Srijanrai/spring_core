package com.springcore.javaconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	private static  ApplicationContext con ; 
	public static void main(String arg[]) {
    con = new AnnotationConfigApplicationContext(javaConfig.class);
    Student student = (Student) con.getBean("getStudent");
    System.out.println(student);
	}
}
