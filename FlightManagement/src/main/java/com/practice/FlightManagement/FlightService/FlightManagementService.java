package com.practice.FlightManagement.FlightService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.FlightManagement.controller.dto.FlightBookingForm;
import com.practice.FlightManagement.entity.Flight;
import com.practice.FlightManagement.entity.Passenger;
import com.practice.FlightManagement.repo.FlightRepo;
import com.practice.FlightManagement.repo.PassengerRepo;

@Service
@Transactional
public class FlightManagementService {
	
	public FlightManagementService fservice;
	
	@Autowired
	private FlightRepo flightRepo;
	
	@Autowired
	private PassengerRepo passengerRepo;
	
	public String FlightBooking(FlightBookingForm fbf) {
		Passenger passenger = new ObjectMapper().convertValue(fbf,Passenger.class);
		Long passenger_id = passengerRepo.save(passenger).getPassenger_id();
		System.out.println("Passenger Information Received Successfully");
		Flight flight = new Flight(123456L, 10000, passenger_id);
		Long f_no = flightRepo.save(flight).getFlightnumber();
		return "Flight Confirmed! Flight Number : "+f_no;
	}
}
