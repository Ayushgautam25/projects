package com.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.springbootdemo.service.EmployeeService;

public class EmployeeController {
	
	//acccepts request(get, post(add),put(update), delete)
	//provides response
	@Autowired
	private EmployeeService empservice;
	public void setEmpservice(EmployeeService empservice) {
		this.empservice = empservice;
	}
	
	
	
	
}
