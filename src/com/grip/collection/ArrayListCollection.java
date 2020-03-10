package com.grip.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListCollection {

	public static void main(String args[]) {
		List <String> list = new ArrayList<>() ;
		list = Arrays.asList("a","b","c","d");
		System.out.println(list);
		
		List <String> l1 = new ArrayList<>();
		l1 = Arrays.asList("1","2","5","3","4");
//		List <String> l2 = new ArrayList<>();
//		l2 = Arrays.asList("8","2","5","3","4","5");
		List <String> l2 = Arrays.asList("8","2","5","3","4","5");
		
		ArrayListCollection AC = new ArrayListCollection();
		System.out.println(AC.replaceElement());
		System.out.println(AC.removeSpecificElement());
		System.out.println(AC.searchElement("3"));
		System.out.println(AC.sortList());
		System.out.println(AC.copyList());
		System.out.println(AC.shuffleList());
		System.out.println(AC.extractList());
		System.out.println(AC.compareList(l1, l2));
		System.out.println(AC.swapElement(l1));
		
	}
	
	public List<String> replaceElement() {
		List <String> lt = new ArrayList<>(Arrays.asList("1","2","3","4"));
		lt.set(2, "5");
		return lt;
	}
	
	public List<String> removeSpecificElement() {
		List <String> lt = new ArrayList<>();
//		lt = Arrays.asList("1","2","5","3","4");
		lt.add("1");
		lt.add("2");
		lt.add("3");
		lt.add("4");
		lt.add("5");
		lt.add("6");
		lt.remove(3);
		return lt;
	}
	
	public Boolean searchElement(String i) {
		List <String> lt = new ArrayList<>();
		lt = Arrays.asList("1","2","5","3","4");
//		
		boolean hasElement = lt.contains(i);
		return hasElement;
	}
	
	public List<Integer> sortList() {
		List <Integer> lt = new ArrayList<>();
		lt = Arrays.asList(1,4,2,3,5);
//		lt.sort(Comparator.naturalOrder());
		Collections.sort(lt);
		return lt;
	}
	
	public List<Integer> copyList() {
		List <Integer> lt = new ArrayList<>();
		lt = Arrays.asList(1,4,2,3,6);
		List <Integer> lt1 = new ArrayList<>();
		lt1 = Arrays.asList(1,4,2,3,5);
		Collections.copy(lt1, lt);
		return lt1;
	}
	
	public List<Integer> shuffleList() {
		List <Integer> lt = new ArrayList<>();
		lt = Arrays.asList(1,4,2,3,6,5,5,6,6,7,8,1);
		Collections.shuffle(lt);
		return lt;
	}
	
	public List<Integer> extractList() {
		List <Integer> lt = new ArrayList<>();
		lt = Arrays.asList(1,4,2,3,6,5,5,6,6,7,8,1);
		List <Integer> newList = lt.subList(1, 5);
		
		return newList;
	}
	public Boolean compareList(List<String> l1, List<String> l2) {
		boolean isSame = l1.equals(l2);
		return isSame;
	}

	public List<String> swapElement(List<String> l1) {
		Collections.swap(l1, 2, 4);
		return l1;
	
}
}
