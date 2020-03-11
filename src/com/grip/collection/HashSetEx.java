package com.grip.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSetEx hse = new HashSetEx();
//		int methods = [];
	}
	
	public HashSet getHashSet() {
		HashSet hs = new HashSet();
		return hs;
	}
	public HashSet getHashSetWithElements() {
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(1,2,3,7,8,9));
		return hs;
	}

}
