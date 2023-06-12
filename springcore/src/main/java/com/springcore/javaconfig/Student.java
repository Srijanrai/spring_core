package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

@Value("Srijan")
String name ;
@Value("149")
int id ; 
@Value("Varanasi")
String city;

private Samosa samosa;
public Student(Samosa samosa2) {
	// TODO Auto-generated constructor stub
}
public void setSamosa(Samosa samosa) {
	this.samosa = samosa;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", city=" + city + ", samosa=" + samosa + "]";
}



}
