package com.Learnings;

public class StaticBlock_Practise {
	
	static int i=0;
	
	static {
		i=10;
		System.out.println("Inside the static block"+" "+i);
	}
	
	StaticBlock_Practise() {
		System.out.println("Inside the constructor: Value of i"+" "+i);
	}
	

}
