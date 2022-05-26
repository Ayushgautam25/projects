package com.collections;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> people = new HashMap<>();
		System.out.println("Initial Hashmap is like this : "+people+"\n");
		people.put(1, "A");
		people.put(2, "B");
		people.put(3, "C");
		people.put(4, "D");
		people.put(5, "E");
		people.put(6, "F");
	    System.out.println("HashMap : "+people);
	    System.out.println("KeySet : "+people.keySet());
	    System.out.println("ValueSet : "+people.values());
	    System.out.println("Key/Value Mappings : "+people.entrySet()+"\n");
	    
	    String val = people.get(3);
	    System.out.println("Value for key 3 is : "+val+"\n");
	    for(int i=1; i<=(people.keySet().size()); i++) {
	    	System.out.print(people.get(i)+", ");
	    }
	    System.out.println("");
	    
	    people.replace(2, "C");
	    System.out.println("HashMap after replacing : "+people);
	    
	    String value = people.remove(6);
	    System.out.println("Value Removed : "+value+"\n HashMap after Removing : "+people);
	    
	    
	    
	}
}
