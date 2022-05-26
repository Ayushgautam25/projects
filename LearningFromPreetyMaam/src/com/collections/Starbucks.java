package com.collections;

import java.util.EnumSet;
import java.util.Iterator;

public class Starbucks {
	enum coffee{
		Short, Tall, Grande, Venti
	}
	public static void main(String[] args) {
		EnumSet<coffee> sizesofcoffee = EnumSet.allOf(coffee.class);
		System.out.println("Sizes of Starbucks coffee are : "+sizesofcoffee+"\n");
		
		Iterator<coffee> iterate = sizesofcoffee.iterator();
		System.out.print("Sizes of Starbucks coffee are : ");
		while(iterate.hasNext()) {
			System.out.print(iterate.next()+", ");
		}
		System.out.println("\n");
		
		sizesofcoffee.clear();
		System.out.println("Cleared enumset is : "+sizesofcoffee);
	}
}
