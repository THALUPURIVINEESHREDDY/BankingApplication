package com.banking.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer loanId;
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customer;
	private String loanType;
	private Double loanAmount;
	private Double pendingAmount;
	private Float intrestRate;
	private LocalDate startDate;
	private Float tenure;
	private String status;
	
	
	
	public Loan() {
	}
	public Loan(Integer loanId, Customer customer, String loanType, Double loanAmount, Double pendingAmount,
			Float intrestRate, LocalDate startDate, Float tenure, String status) {
		this.loanId = loanId;
		this.customer = customer;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.pendingAmount = pendingAmount;
		this.intrestRate = intrestRate;
		this.startDate = startDate;
		this.tenure = tenure;
		this.status = status;
	}
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Double getPendingAmount() {
		return pendingAmount;
	}
	public void setPendingAmount(Double pendingAmount) {
		this.pendingAmount = pendingAmount;
	}
	public Float getIntrestRate() {
		return intrestRate;
	}
	public void setIntrestRate(Float intrestRate) {
		this.intrestRate = intrestRate;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public Float getTenure() {
		return tenure;
	}
	public void setTenure(Float tenure) {
		this.tenure = tenure;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
