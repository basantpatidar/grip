package com.grip.collection;
import java.util.ArrayList;
import java.util.List;

public class Colors {

	public static void main(String args[]) {
		List <String> lt = new ArrayList<>();
		
		lt.add("Blue");
		lt.add("green");
		lt.add("red");
		
		for(String i : lt) {
			System.out.println(i);
			}
		
		StringBuilder ex = new StringBuilder();
		ex.append("This ");
		ex.append("is ");
		ex.append("append.");
		System.out.println(ex);
		}
}
