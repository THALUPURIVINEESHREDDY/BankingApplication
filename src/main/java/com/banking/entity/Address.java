package com.banking.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	private String address;
	private String state;
	private String country;
	private Integer pincode;
	
	
	public Address() {
	}


	public Address(String address, String state, String country, int pincode) {
		this.address = address;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Integer getPincode() {
		return pincode;
	}


	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
	
}
