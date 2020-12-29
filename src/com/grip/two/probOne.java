package com.grip.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class probOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> arr = Arrays.asList(1,2,5,3,4); 
		segment(2,arr);

	}
	
	public static int segment(int x, List<Integer> arr) {
		Collections.sort(arr);
//		System.out.println(arr);
		int count = 0;
		List <List> newArr = new ArrayList<>();
		for(int i = 0; i < arr.size(); i++) {
			List<Integer> innerList = new ArrayList<Integer>();
			if(count == arr.size() -1 ) {
				break;
			}
			for(int j = 0; j < x; j++) {
				if(count == arr.size() ) {
					break;
				}
//				boolean c = count == arr.size()?break:"";
//				System.out.println(count);
				innerList.add(arr.get(count));
				count++;
				
			}
			newArr.add(innerList);
			
			count= count-1;
			System.out.println(innerList);
		}
		System.out.println(newArr);
		return 0;
	}

}



//[1,2,3,4,5]
//[[1,2],[2,3],[3,4],[4,5]]