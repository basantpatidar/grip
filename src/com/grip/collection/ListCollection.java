package com.grip.collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class ListCollection {

	public static void main(String args[]) {
		List value = new ArrayList();
		
		value.add(10);
		value.add(20);
		value.add(40);
		value.add(2,30);
		
		for(int i = 0; i < value.size(); i++) {
			System.out.println(value.get(i));
		}
	}
}
