/**
 * 
 */
package com.grip.collection;

/**
 * @author basant
 *
 */
public class FindTheSum {

	/**
	 * 
	 */
	public FindTheSum() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	static void  pairs_value(int inputArr[], int inputNum)
	  {
	  System.out.println("Pairs of elements and their sum : ");
	 
	  for (int i =  0; i < inputArr.length; i++)
	  {
	  for (int j  = i+1; j < inputArr.length; j++)
	  {
	  if(inputArr[i]+inputArr[j] == inputNum)
	  {
	  System.out.println(inputArr[i]+" + "+inputArr[j]+" =  "+inputNum);
	  }
	  }
	  }
	  }
	  
	  public static void  main(String[] args)
	  {
	  pairs_value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);
	  
	  pairs_value(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);
	  
	  }
	}