package com.grip.one;

public class CarType extends Car{
	
	private String color;
	
	
	public String getColor() {
		super.getColor();
		System.out.println("Its CarType");
		return color;
	}


	public void setColor(String color) {
		super.setColor(color);
		this.color = color;
	}


	public static void main(String[] args) {
		
		
		Car c = new Car();
		Car ct = new CarType();
		
		c.setMake("Ford");
		c.setModel("Fussion");
		c.setWheels(4);
		c.setDoors(4);
		ct.setColor("Black");
		System.out.print("Its "+c.getMake());
		System.out.print(" "+c.getModel());
		System.out.print(" with "+ c.getWheels());
		System.out.print(" wheels and "+ c.getDoors());
		System.out.print(" doors in "+ ct.getColor());
		
	}

}
