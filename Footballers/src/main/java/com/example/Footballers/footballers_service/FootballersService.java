package com.example.Footballers.footballers_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.Footballers.domain.Footballer;

@Service
public interface FootballersService extends JpaRepository<Footballer, Integer>{

}
