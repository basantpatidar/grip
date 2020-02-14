package com.grip.one;

class A{
	private int firstName;
	
	public A () {
		System.out.println("This is A default");
	}
	public A (String firstName) {
		System.out.println("This is A Parameterized");
	}
	
	public int getFirstName() {
		return firstName;
	}
	public void setFirstName(int firstName) {
		this.firstName = firstName;
	}
	
}

class B extends A{
	public B () {
		System.out.println("This is B default");
	}
	public B (String lastName) {
		lastName = "Patel";
		System.out.println("This is B Parameterized");
	}
	
}


public class C extends B{
	public C () {
		System.out.println("This is C default");
	}
	public C (String name) {
		super(name);
		System.out.println("This is C Parameterized "+name);
	}
	public void someMethod() {
		B someObject = new B();
		someObject.getFirstName();
	}
	
	
	public static void main(String[] args) {
		C c = new C();
		C printName = new C("Patidar");
		
//		B b = new B();
		c.getFirstName();
	}
}
