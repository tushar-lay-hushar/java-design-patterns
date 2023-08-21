package com.behavioral.iterator.test;

import com.behavioral.iterator.Iterator;
import com.behavioral.iterator.list.ItemsList;
import com.behavioral.iterator.list.List;

public class Test {

	public static void main(String[] args) {
		
		String[] names = new String[5];
		
		names[0] = "Hello, ";
		names[1] = "My ";
		names[2] = "name ";
		names[3] = "is ";
		names[4] = "Tushar.";
		
		List<String> list = new ItemsList<>(names);
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		
	}

}
