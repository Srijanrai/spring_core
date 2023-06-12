package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;


@Configurable

public class javaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean
 public Student getStudent() {
	 Student student = new Student(getSamosa());
	 return student;
 }
}
