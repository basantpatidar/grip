package com.grip.one;

public class First {

	public static void main(String[] args) {
		double result =  calcFeetAndInchesToCentimeters(7, 5);
		System.out.println(result);
		result = calcFeetAndInchesToCentimeters(24);
		System.out.println(result);
	}
	public static double calcFeetAndInchesToCentimeters (int feet, int inch) {
		if(feet <= 0 && inch <=0 &&  inch >= 12) {
			return -1;
		}
		double centimeters = feet * 30.48 + inch * 2.54;
		return centimeters;
	}
	
	public static double calcFeetAndInchesToCentimeters (int inch) {
		if(inch <=0 ) {
			return -1;
		}
		double foot = inch / 12;
		return foot;
	}

}
