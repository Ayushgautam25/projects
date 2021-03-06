package com.transaction.SpringTransactionDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.SpringTransactionDemo.controller.dto.AppointmentFormDto;
import com.transaction.SpringTransactionDemo.entity.Patient;
import com.transaction.SpringTransactionDemo.service.BookAppointmentService;

@RestController
public class BookAppointmentController {
	@Autowired
	private BookAppointmentService bookAppointmentService;

//	@Autowired
//	public void setBookAppointmentService(BookAppointmentService bookAppointmentService) {
//		this.bookAppointmentService = bookAppointmentService;
//	}
//	
	@GetMapping("/")  
	private List<Patient> getAllPatient()   
	{  
	return bookAppointmentService.getAllPatient();  
	}  
	
	@GetMapping("/{patientNumber}")  
	private Optional<Patient> getPatientbyId(@PathVariable Long patientNumber)   
	{  
	return bookAppointmentService.getPatientbyId(patientNumber);  
	}  
	
	@PostMapping("/book")
	public String bookAppointment(@RequestBody AppointmentFormDto appointmentFormDto) {
		return bookAppointmentService.bookAppointment(appointmentFormDto);
	}
	
	@DeleteMapping("/{patientNumber}")
	private Optional<Patient> deletePatientbyId(@PathVariable Long patientNumber){
		return bookAppointmentService.deletePatientbyId(patientNumber);
	}
	
	@PutMapping("/")
	public String bookAppointment1(@RequestBody AppointmentFormDto appointmentFormDto) {
		return bookAppointmentService.bookAppointment(appointmentFormDto);
	}
}
