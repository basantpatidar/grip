package com.grip.two;

public class Vehicle {
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private String size;
	
	@SuppressWarnings("unused")
	private int currentVelocity;
	private int currentDirection;
	
	
	
	Vehicle(String name, String size){
		this.name = name;
		this.size = size;
		
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}
	
	public void steer(int direction) {
		this.currentDirection += direction;
		
		System.out.println("You are in "+currentDirection+" Direction");
	}

	

}
