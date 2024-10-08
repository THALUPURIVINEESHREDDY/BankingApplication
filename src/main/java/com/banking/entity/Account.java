package com.banking.entity;

import java.time.LocalDate;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.CascadeType;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accountId;
	
	@SuppressWarnings("deprecation")
	@ManyToOne
	@JoinColumn(name="customerId")
	@Cascade(CascadeType.DELETE)
	private Customer customer;
	@SuppressWarnings("deprecation")
	@ManyToOne
	@JoinColumn(name="branchId")
	@Cascade(CascadeType.DELETE)
	private Branch branch;
	private String accountType;
	private LocalDate createdAt;
	private String status;
	private Double balance;
	
	
	public Account() {
	}
	public Account(Integer accountId, Customer customer, Branch branch, String accountType, LocalDate createdAt,
			String status, Double balance) {
		this.accountId = accountId;
		this.customer = customer;
		this.branch = branch;
		this.accountType = accountType;
		this.createdAt = createdAt;
		this.status = status;
		this.balance = balance;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}
