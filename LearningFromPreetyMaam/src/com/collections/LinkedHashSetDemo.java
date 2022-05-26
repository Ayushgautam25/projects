package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		ArrayList<Integer> evenNums = new ArrayList<>();
		for(int i=2; i<=10; i+=2) {
			evenNums.add(i);
		}
		LinkedHashSet<Integer> num = new LinkedHashSet<>(evenNums);
		num.add(12);
		System.out.println(num);
		System.out.println("\n");
		
		Iterator<Integer> iterate = num.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		num.remove(2);
		num.remove(4);
		num.remove(6);
		num.remove(8);
		System.out.println(num);
		
		num.addAll(evenNums);
		System.out.println(num);
		
		LinkedHashSet<Integer> intersection = new LinkedHashSet<>(num);
		intersection.retainAll(evenNums);
		System.out.println(intersection);
		
		LinkedHashSet<Integer> difference = new LinkedHashSet<>(num);
		difference.removeAll(evenNums);
		System.out.println(difference);
	}
}
