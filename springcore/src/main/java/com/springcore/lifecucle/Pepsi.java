package com.springcore.lifecucle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class  Pepsi implements InitializingBean,DisposableBean {
   int price  ; 
   
	public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("Pepsi initiated");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("Pepsi Destroyed");
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	

}
