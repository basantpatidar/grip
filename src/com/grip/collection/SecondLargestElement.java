/**
 * 
 */
package com.grip.collection;

import java.util.Arrays;

/**
 * @author Basant
 *
 */
public class SecondLargestElement {

	/**
	 * 
	 */
	public SecondLargestElement() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] num_array = {
	            10789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
		
	System.out.println("Original array : "+Arrays.toString(num_array));            
	Arrays.sort(num_array);
	int index = num_array.length-1;
	while(num_array[index]==num_array[num_array.length-1]){
	index--;
	}
	System.out.println("Second largest value: " + num_array[index]);
	}


}
