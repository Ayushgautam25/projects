package com.practice.Spotify.domain;

import javax.persistence.*;

@Entity
public class Gaana {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
	@Column
	private String s_name;
	@Column
	private String singer;
	@Column
	private int year;
	@Column
	private String genere;
	public Gaana() {	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
}
