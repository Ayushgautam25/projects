package com.collections;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Scanner;

public class TreeMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer, String> pt = new TreeMap<>();
		pt.put(1,"Hydrogen");
		pt.put(2,"Helium");
		pt.put(3,"Lithium");
		pt.put(5,"Boron");
		pt.put(4,"Beryllium");
		pt.put(7, null);
		pt.put(13, "Aluminium");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements upto which periodic table you want : ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print(pt.get(i)+", ");
		}
		System.out.println("");
		System.out.println("Enter no. of element you want to add : ");
		int p = sc.nextInt();
		if(pt.containsKey(p)) {
			if(pt.containsValue(null)){
				System.out.println("enter the value to be replaced");
				String s = sc.next();
				pt.replace(p, s);
				
			}
			else {
			System.out.println("This element is already in the table.");
			}
			
		}
		else {
		System.out.println("Enter name of element to be entered");
		String scanning = sc.next();
		pt.putIfAbsent(p, scanning);
		sc.close();
		System.out.println(pt);
		}
		System.out.println("Periodic Table : "+pt );
	}
}
