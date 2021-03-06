package com.practice.FlightManagement.entity;

import javax.persistence.*;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long flightnumber;
	private int fare;
	private Long passenger_id;
	public Flight() {}
	public Flight(long i, int fare, Long passenger_id) {
		super();
		this.flightnumber = i;
		this.fare = fare;
		this.passenger_id = passenger_id;
	}
	public Long getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(Long flightnumber) {
		this.flightnumber = flightnumber;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public Long getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(Long passenger_id) {
		this.passenger_id = passenger_id;
	}
	
}
