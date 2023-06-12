package com.springcore.stereotype;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Person {
	@Value("Srijan")
String name ; 
	@Value("Varanasi")
String address;
	@Value("#{22+90}")
	int salary ; 
	
// standalone Collection type 
	
	@Value("#{phone}")
	List<String>phones;
	
	// to invoke a method
	//T(class).name(param)
	@Value("#{T(java.lang.Math).sqrt(144)}")
	int value;
	
	// to invoke static variable 
	// T(class).name
	@Value("#{T(java.lang.Math).PI}")
	int ans; 
	
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + ", salary=" + salary + ", phones=" + phones + ", value="
			+ value + ", ans=" + ans + "]";
}



}
