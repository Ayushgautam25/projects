package com.collections;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist_Create {
	public static void main(String[] args) {
		LinkedList<String> friendlist = new LinkedList<String>();
		friendlist.add("Atul");
		friendlist.add("Aditya");
		friendlist.add("Aditi");
		friendlist.add("Jai");
		friendlist.add("Shivam");
		friendlist.add("Himanshu");
		
		System.out.println("initial linked list" +friendlist);
		
		System.out.println("Adding Versha At 2nd Index\n");
		friendlist.add(2,"Versha");
		System.out.println(friendlist);
		
		System.out.println("Adding Prateek at 1st\n");
		friendlist.addFirst("Prateek");
		System.out.println(friendlist);
		
		
		System.out.println("Adding muskan at last\n");
		friendlist.addLast("Muskan");
		System.out.println(friendlist);
		
		List<String> familylist = new LinkedList<>();
		familylist.add("nisha");
		familylist.add("neha");
		friendlist.addAll(familylist);
		
		System.out.println(friendlist);
	}

}