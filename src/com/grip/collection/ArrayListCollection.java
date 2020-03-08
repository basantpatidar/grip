package com.grip.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCollection {

	public static void main(String args[]) {
		List <String> list = new ArrayList<>() ;
		list = Arrays.asList("a","b","c","d");
		System.out.println(list);
		
		ArrayListCollection AC = new ArrayListCollection();
		System.out.println(AC.replaceElement());
		System.out.println(AC.removeSpecificElement());
		
	}
	
	public List replaceElement() {
		List <String> lt = new ArrayList<>(Arrays.asList("1","2","3","4"));
		lt.set(2, "5");
		return lt;
	}
	
	public List removeSpecificElement() {
		List <String> lt = new ArrayList<>();
//		lt = Arrays.asList("1","2","5","3","4");
		lt.add("1");
		lt.add("2");
		lt.add("3");
		lt.add("4");
		lt.add("5");
		lt.add("6");
		lt.remove(3);
		return lt;
	}
}
