package com.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springbootdemo.dao.EmployeeDao;

public class EmployeeService {
	@Autowired
	private EmployeeDao empdao;
	
}
