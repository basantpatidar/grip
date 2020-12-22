package com.grip.collection;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author basant
 *
 */
public class TwoDArray {

	/**
	 * 
	 */
	public TwoDArray() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   {
			      int m, n, c, d;
			      Scanner in = new Scanner(System.in);
			 
			      System.out.println("Enter number of rows of matrix");
			      m = in.nextInt();
			      System.out.println("Enter number of columns of matrix");
			      n  = in.nextInt();
			 
			      int arrayOne[][] = new int[m][n];
			      int arrayTwo[][] = new int[m][n];
			      int total[][] = new int[m][n];
			 
			      System.out.println("Enter elements of first matrix");
			 
			      for (  c = 0 ; c < m ; c++ )
			         for ( d = 0 ; d < n ; d++ )
			            arrayOne[c][d] = in.nextInt();
			 
			      System.out.println("Enter the elements of second matrix");
			 
			      for ( c = 0 ; c < m ; c++ )
			         for ( d = 0 ; d < n ; d++ )
			            arrayTwo[c][d] = in.nextInt();
			 
			      for ( c = 0 ; c < m ; c++ )
			         for ( d = 0 ; d < n ; d++ )
			             total[c][d] = arrayOne[c][d] + arrayTwo[c][d]; 
			 
			      System.out.println("total of the matrices:-");
			 
			      for ( c = 0 ; c < m ; c++ )
			      {
			         for ( d = 0 ; d < n ; d++ )
			            System.out.print(total[c][d]+"\t");
			 
			         System.out.println();
			      }
			   }
			}
}