package com.grip.one;

public class VipCustomer {
	
	private int creditLimit;
	private String email;
	
	VipCustomer(){
		this(5);
	}
	VipCustomer(int one){
		this(one, 2);
			
		}	
	VipCustomer(int one, int two){
		int three = one + two;
		System.out.println(three);
	}
	
	
	

}
