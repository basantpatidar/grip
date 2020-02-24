package com.grip.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ListCollection {

	public static void main(String args[]) {
		List<Integer> value = new ArrayList<>();
		
		value.add(10);
		value.add(20);
		value.add(40);
		value.add(2,30);
		value.remove(2);
		
		Collections.reverse(value);
		Collections.shuffle(value);
		
		
//		List 
		
//		for(int i = 0; i < value.size(); i++) {
//			System.out.println(value.get(i));
//		}
		
		System.out.println(value.isEmpty());
		
		for (Integer o : value) {
			System.out.println(o);
			
		}
		
	}
}
