package com.springcore.ci;

import java.util.List;

public class Person {
private String name ; 
private int id ; 
Certi certi;
List<String> phones; 
// constructor 
public Person(String name , int id, Certi certi,List<String> phones) {
	this.name = name; 
	this.id = id ; 
	this.certi = certi; 
	this.phones = phones; 
}
// print 
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", certi=" + certi + " , phones=" + phones +"]";
}


}
