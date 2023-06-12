package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
public class Person {
 public List<String> friends;
 public Map<String,Integer> fee;
 public Properties properties;

public Map<String, Integer> getFee() {
	return fee;
}

public void setFee(Map<String, Integer> fee) {
	this.fee = fee;
}

public Properties getProperties() {
	return properties;
}

public void setProperties(Properties properties) {
	this.properties = properties;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

@Override
public String toString() {
	return "Person [friends=" + friends + ", fee=" + fee + ", properties=" + properties + "]";
}


 
}
