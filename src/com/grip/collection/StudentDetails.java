package com.grip.collection;

public class StudentDetails{

	public static Student getStudent(String name, String lname) {
		Student student = new Student();
		student.setName(name);
		student.setLname(lname);
		return student;
	}
	
	
	public static void main(String[] args) {
		
		Student studentRef = getStudent("Basant", "Patidar");
		System.out.println(studentRef.getName());
		System.out.println(studentRef.getLname());
	}
}
