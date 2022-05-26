package com.practice.FlightManagement.entity;

import javax.persistence.*;

@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long passenger_id;
	private String passenger_name;
	private int age;
	private Long passenger_contactno;
	private String source;
	private String destination;
	public Passenger() {}
	public Passenger(Long passenger_id, String passenger_name, int age, Long passenger_contactno, String source,
			String destination) {
		super();
		this.passenger_id = passenger_id;
		this.passenger_name = passenger_name;
		this.age = age;
		this.passenger_contactno = passenger_contactno;
		this.source = source;
		this.destination = destination;
	}
	public Long getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(Long passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getPassenger_contactno() {
		return passenger_contactno;
	}
	public void setPassenger_contactno(Long passenger_contactno) {
		this.passenger_contactno = passenger_contactno;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
}
