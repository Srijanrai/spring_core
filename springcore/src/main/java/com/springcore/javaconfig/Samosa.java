package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;
@Component 
public class Samosa {
@Value("10")
int price ;
public void getPrice() {
	System.out.print(price);
}
@Override
public String toString() {
	return "Samosa [price=" + price + "]";
} 

}
