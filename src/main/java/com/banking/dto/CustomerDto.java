package com.banking.dto;

import java.time.LocalDate;

import com.banking.entity.Address;

public class CustomerDto {
	private Integer customerId;
	private String firstName;
	private String lastName;
	private String email;
	private Long phoneNum;
	private LocalDate dob;
	private Address address;
	private LocalDate createdAt;
	
	
	
	public CustomerDto() {
	}
	public CustomerDto(Integer customerId, String firstName, String lastName, String email, Long phoneNum,
			LocalDate dob, Address address, LocalDate createdAt) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.dob = dob;
		this.address = address;
		this.createdAt = createdAt;
	}
	public CustomerDto(Integer customerId, String firstName, String lastName, String email, Long phoneNum, LocalDate dob,
			Address address) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.dob = dob;
		this.address = address;
		this.createdAt = LocalDate.now();
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
