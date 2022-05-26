package com.springpractice;

public class Student {
	private int sid;
	private String Name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		Name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", Name=" + Name + "]";
	}
}
