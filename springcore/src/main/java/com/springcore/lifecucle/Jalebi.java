package com.springcore.lifecucle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
 int pricekg ;
 public Jalebi(int pricekg) {
	 this.pricekg = pricekg ;
 }
@Override
public String toString() {
	return "Jalebi [pricekg=" + pricekg + "]";
}
 @PostConstruct
 public void init() {
	 System.out.print("Initiated Jalebi");
 }
 @PreDestroy
 public void destroy() {
	 System.out.print("Destroyed Jalebi");
 }
}
