package com.grip.collection;

public class Student {

	private int rollNumber;
	private String name;
	private String lname;
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void printAllDetails() {
		Student st = new Student(); 
		System.out.println(st.name + " " + st.lname +" "+ st.rollNumber);
	}
}
