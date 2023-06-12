package com.springcore.lifecucle;

public class Samosa {
  int price ;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Samosa(int price) {
	super();
	this.price = price;
}

public Samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
} 
  
   public void init() {
	   System.out.print("Samosa initiated");
   }
   public void destroy() {
	   System.out.print("Samosa Destroyed");
   }
   
}
