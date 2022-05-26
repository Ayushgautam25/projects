package com.springcore;

public class Employee {
	private int empl_id;
	private String empl_name;
	private Address add;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empl_id, String empl_name, Address add) {
		super();
		this.empl_id = empl_id;
		this.empl_name = empl_name;
		this.add = add;
	}
	public int getEmpl_id() {
		return empl_id;
	}
	public void setEmpl_id(int empl_id) {
		this.empl_id = empl_id;
	}
	public String getEmpl_name() {
		return empl_name;
	}
	public void setEmpl_name(String empl_name) {
		this.empl_name = empl_name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee [empl_id=" + empl_id + ", empl_name=" + empl_name + ", add=" + add + "]";
	}
	public void initit() {
		System.out.println("Init Method is used");
	}
	public void dd() {
		System.out.println("Destroy method is used");
	}
	
	
}
