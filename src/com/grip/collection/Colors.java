package com.grip.collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		
		Map <String, String> map = new HashMap <String, String>();
		
		map.put("1", "Blue");
		map.put("2", "Black");
		map.put("3", "Red");
		map.put("4", "Green");
		

		
		}
	
	
	
//	Map< String,Integer> hm =  
//            new HashMap< String,Integer>(); 
//hm.put("a", new Integer(100));
	
	
}
