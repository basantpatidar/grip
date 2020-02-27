package com.grip.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapUse {

	public static void main(String[] args) {
		Map <Integer, String> map = new HashMap <> ();
		
		map.put(01, "Java");
		map.put(02, "JavaScript");
		map.put(03, "Python");
		map.put(04, "Php");
		
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Java"));
		
//		map.equals()
		map.clear();
		
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys) {
			System.out.println(map.get(key));
		}
	}
}
