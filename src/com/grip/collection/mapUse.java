package com.grip.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapUse {

	public static void main(String[] args) {
		Map <Integer, String> map = new HashMap <> ();
		Map <Integer, String> mp = new HashMap <> ();
		
		map.put(01, "Java");
		map.put(02, "JavaScript");
		map.put(03, "Python");
		map.put(04, "Php");
		
		mp.put(01, "React");
		
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Java"));
		
		
		System.out.println(map.equals(mp));
		
		
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys) {
			System.out.println(map.get(key));
		}
	}
}
