/**
 * 
 */
package com.grip.collection;

import java.util.Arrays;

/**
 * @author basant
 *
 */
public class SecondSmallest {

	/**
	 * 
	 */
	public SecondSmallest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    int[] num_array = {-1, 4, 0, 2, 7, -3};
	    System.out.println("Original numeric array : "+Arrays.toString(num_array));
	    int min = Integer.MAX_VALUE;
	    int second_min = Integer.MAX_VALUE;
	    for (int i = 0; i < num_array.length; i++) {
	        if(num_array[i]==min){
	          second_min=min;
	        } else if (num_array[i] < min) {
	            second_min = min;
	            min = num_array[i];
	        } else if (num_array[i] < second_min) {
	            second_min = num_array[i];
	        }

	    }
	    System.out.println("The Second lowest number is : " + second_min);
	    }
}
