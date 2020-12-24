/**
 * 
 */
package com.grip.collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author basant
 *
 */
public class ArrayToArrayList {

	/**
	 * 
	 */
	public ArrayToArrayList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  {
			  String[]  my_array = new String[] {"Perl", "C#", "Python", "JAVA", "PHP","C++"};
			  ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
			  
			  System.out.println(list);
			  }
			}
}
