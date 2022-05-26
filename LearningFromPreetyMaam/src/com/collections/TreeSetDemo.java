package com.collections;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> group1 = new TreeSet<>();
		group1.add("Ayush");
		group1.add("Kshitiz");
		
		System.out.println(group1+"\n");
		
		LinkedList<String> batch = new LinkedList<String>();
		batch.add("Aman");
		batch.add("Himanshu");
		batch.add("Aditi");
		batch.add("Lakshya");
		batch.add("Gaurav");
		batch.add("Jatin");
		batch.add("Danny");
		batch.add("DANNY");
		System.out.println(batch+"\n");
		
		group1.addAll(batch);
		System.out.println(group1+"\n");
		
		group1.remove("Kshitiz");
		System.out.println(group1+"\n");
		
		
		group1.removeAll(group1);
		System.out.println(group1);
	}
}