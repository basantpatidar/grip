package com.grip.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCollection {

	public static void main(String args[]) {
		List <String> list = new ArrayList<> (Arrays.asList("a","b","c"));
//		Arrays.asList("a","b","c");
		System.out.println(list);
		
		ArrayListCollection AC = new ArrayListCollection();
		System.out.println(AC.replaceElement());
		
	}
	
	
	
	public List replaceElement() {
		List <String> lt = new ArrayList<>(Arrays.asList("1","2","3","4"));
		lt.set(2, "5");
		return lt;
	}
}
