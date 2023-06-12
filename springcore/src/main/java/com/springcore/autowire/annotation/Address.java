package com.springcore.autowire.annotation;

public class Address {
  String city; 
  String name ;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address(String city, String name) {
	super();
	this.city = city;
	this.name = name;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [city=" + city + ", name=" + name + "]";
} 
  
}
