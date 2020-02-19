package com.grip.collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class First {

	public static void main(String[] args) {
		Collection value = new ArrayList();
		value.add(10);
		value.add(20);
		value.add(30);

		Iterator it = value.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
