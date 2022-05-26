package com.practice.Spotify.spotify_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.practice.Spotify.domain.Spotify;

@Service
public interface Spotify_service extends JpaRepository<Spotify, Integer>{

}