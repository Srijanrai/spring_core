package com.springcore.lifecucle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   private static AbstractApplicationContext context ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        context = new ClassPathXmlApplicationContext("com/springcore/lifecucle/config.xml");
        Samosa s = (Samosa)context.getBean("s1");
        System.out.println(s);
        System.out.println("+++++++++++++");
        Pepsi p = (Pepsi)context.getBean("p1");
        System.out.println(p);
        Jalebi j = (Jalebi)context.getBean("j1");
        System.out.print(j);
        context.registerShutdownHook();
	}

}
