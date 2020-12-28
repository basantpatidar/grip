package com.grip.two;

import java.math.BigDecimal;

public class BigDecimalToDouble {
	
	public static void main(String args[]) {
		BigDecimal bigDecimal =  new BigDecimal(123);
		Double double1 = Double.valueOf(String.valueOf(bigDecimal));
		System.out.println(double1);
	}

}
