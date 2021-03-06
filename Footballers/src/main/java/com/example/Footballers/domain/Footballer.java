package com.example.Footballers.domain;

import javax.persistence.*;

@Entity
public class Footballer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jersey_no;
	@Column
	private String Name;
	@Column
	private int Age;
	@Column
	private String Country;
	public Footballer() {	}
	public int getJersey_no() {
		return jersey_no;
	}
	public void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
}
