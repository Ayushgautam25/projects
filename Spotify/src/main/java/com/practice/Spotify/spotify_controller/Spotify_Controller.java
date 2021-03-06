package com.practice.Spotify.spotify_controller;

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

import com.practice.Spotify.domain.Spotify;
import com.practice.Spotify.spotify_service.Spotify_service;

@RequestMapping("/Spotify/api")
@RestController

public class Spotify_Controller {
	private Spotify_service sservice;
	@Autowired
	public void setFootballersService(Spotify_service sservice) {
		this.sservice = sservice;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Spotify>> getAll(){
		return ResponseEntity.ok(sservice.findAll());
	}
	
	@GetMapping("/{jersey_no}")
	public ResponseEntity<Spotify> findById(@PathVariable Integer m_id){
		return ResponseEntity.ok(sservice.findById(m_id).orElse(null));
	}
	
	@PutMapping("/")
	public ResponseEntity<Spotify> add(@RequestBody Spotify spotify){
		return ResponseEntity.ok(sservice.save(spotify));
	}
	@PostMapping("/")
	public ResponseEntity<Spotify> update(@RequestBody Spotify spotify){
		return ResponseEntity.ok(sservice.save(spotify));
	}
	@DeleteMapping("/{m_id}")
	public ResponseEntity<Spotify> delete(@PathVariable Integer m_id){
		sservice.findById(m_id).ifPresent(sservice::delete);
		return ResponseEntity.ok().build();
	}
}