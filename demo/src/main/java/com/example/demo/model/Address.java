package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Address {
	@Id
	private int hNo;
	private String city;

	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
