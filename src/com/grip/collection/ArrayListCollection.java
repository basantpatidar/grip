package com.grip.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCollection {

	public static void main(String args[]) {
		ArrayList <String> list = new ArrayList<> (Arrays.asList("a","b","c"));
		System.out.println(list.get(0));
	}
}
