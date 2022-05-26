package com.collections;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
class Student implements Comparable<Student>{
	String Name;
	int r_no;
	int batchcode;
//	Student(String s, int r, int batchcode){
//		r_no = r;
//		Name = s;
//	}
	

	
public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getR_no() {
		return r_no;
	}


	public void setR_no(int r_no) {
		this.r_no = r_no;
	}


	public int getBatchcode() {
		return batchcode;
	}


	public void setBatchcode(int batchcode) {
		this.batchcode = batchcode;
	}


public Student(String name, int r_no, int batchcode) {
	super();
	Name = name;
	this.r_no = r_no;
	this.batchcode = batchcode;
}

@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.getR_no() - o.getR_no();
}
@Override
public String toString() {
	return Name+" "+ r_no +" "+ batchcode;
}

}
public class UserDefinedSet {
	public static void main(String[] args) {
		
		Student ob1 = new Student("Ayush", 9, 1235);
		Student ob2 = new Student("Yash", 7, 1236);
		Student ob3 = new Student("Piyush",1, 1237);
		Student ob4 = new Student("Shubham", 2, 1238);
		
		Set<Student> setStudents = new TreeSet<>();
		
		setStudents.add(ob1);
		setStudents.add(ob2);
		setStudents.add(ob3);
		setStudents.add(ob4);
		setStudents.add(ob1);
		
//		System.out.println(setStudents+"\n");
//		setStudents = ((TreeSet<Student>) setStudents).descendingSet();
//				System.out.println(setStudents);
//		Set<Student> reversetraverse1 = new TreeSet<Student>(setStudents.descendingSet()); 
//		Set<Student> reversetraverse = ((TreeSet<Student>) setStudents).descendingSet();
//		System.out.println(reversetraverse+"\n");
		
		System.out.println(setStudents);
		
		setStudents = new TreeSet<>(Comparator.comparing(Student::getName));
		setStudents.add(new Student("Nivesh",5, 1356));
		setStudents.add(new Student("NIVESH",6, 1357));
		System.out.println("Set contains Ayush or not: "+setStudents.contains(ob1));
		System.out.println(setStudents);
		
	}
}
