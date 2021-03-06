package com.example.Footballers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Footballers.domain.Footballer;
import com.example.Footballers.footballers_service.FootballersService;

@RequestMapping("/Footballer/api")
@RestController

public class Footballers_Controller {
	private FootballersService fservice;
	@Autowired
	public void setFootballersService(FootballersService fservice) {
		this.fservice = fservice;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Footballer>> getAll(){
		return ResponseEntity.ok(fservice.findAll());
	}
	
	@GetMapping("/{jersey_no}")
	public ResponseEntity<Footballer> findById(@PathVariable Integer jersey_no){
		return ResponseEntity.ok(fservice.findById(jersey_no).orElse(null));
	}
	
	@PutMapping("/")
	public ResponseEntity<Footballer> add(@RequestBody Footballer footballer){
		return ResponseEntity.ok(fservice.save(footballer));
	}
	@PostMapping("/")
	public ResponseEntity<Footballer> update(@RequestBody Footballer footballer){
		return ResponseEntity.ok(fservice.save(footballer));
	}
	@DeleteMapping("/{jersey_no}")
	public ResponseEntity<Footballer> delete(@PathVariable Integer jersey_no){
		fservice.findById(jersey_no).ifPresent(fservice::delete);
		return ResponseEntity.ok().build();
	}
}