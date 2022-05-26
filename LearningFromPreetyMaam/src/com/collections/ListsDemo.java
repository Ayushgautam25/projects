package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListsDemo {
	public static void main(String[] args) {
		ArrayList <Integer> list123 = new ArrayList <Integer> ();
		list123.add(10);
		list123.add(20);
		list123.add(30);
		list123.add(40);
		
		
		System.out.println(list123);
		System.out.println(list123.size());
		
		
		Integer numbers = list123.get(0);
		System.out.println(numbers);
		
		
		list123.set(0, 35);
		list123.set(1, 25);
		System.out.println(list123);
		
		
		Collections.sort(list123);
		System.out.println(list123);
		
		
		list123.remove(1);
		System.out.println(list123);
		
		
		System.out.println("List contains 40 : " + list123.contains(40));
		
		
		for (Integer integer : list123) {
			System.out.println(integer);
		}
		
		
		System.out.println("");
		
		
		Iterator<Integer> iterator = list123.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}