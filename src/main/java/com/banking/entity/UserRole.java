package com.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UserRole {
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customer;
	@Id
	private String userName;
	private String password;
	private String role;
	public UserRole(Customer customer, String userName, String password, String role) {
		super();
		this.customer = customer;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	public UserRole() {
		super();
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
