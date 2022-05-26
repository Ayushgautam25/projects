package com.collections;

import java.util.HashMap;
import java.util.Map;

class people1{
	private Integer id;
	private String Name;
	private String Subject;
	people1(Integer id, String Name, String Subject){
		this.id = id;
		this.Name = Name;
		this.Subject = Subject;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+Name+" "+Subject;
	}
}

public class UserDefinedMapDemo {
	public static void main(String[] args) {
		Map<Integer, people1> map1 = new HashMap<>();
		map1.put(101, new people1(101, "A", "CSE"));
		map1.put(102, new people1(102, "B", "CSE"));
		map1.put(103, new people1(103, "C", "CSE"));
		
		System.out.println(map1);
	}
}
