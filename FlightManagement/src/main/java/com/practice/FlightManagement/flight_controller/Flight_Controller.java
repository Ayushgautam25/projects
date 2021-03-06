package com.practice.FlightManagement.flight_controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.FlightManagement.FlightService.FlightManagementService;
import com.practice.FlightManagement.controller.dto.FlightBookingForm;


@RequestMapping("/api")
@RestController
public class Flight_Controller {
	
	@Autowired
	public FlightManagementService fservice;
	
	@PostMapping("/")
	public String FlightBooking(@RequestBody FlightBookingForm fbf) {
		return fservice.FlightBooking(fbf);
	}
	
}
