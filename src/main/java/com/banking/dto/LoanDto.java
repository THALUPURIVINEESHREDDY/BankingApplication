package com.banking.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class LoanDto {
	private Integer loanId;
	private Integer customerId;
	private String loanType;
	private Double loanAmount;
	private Double pendingAmount;
	private Float intrestRate;
	@JsonFormat(shape = Shape.STRING,pattern = "yyyy-MM-dd")
	private LocalDate startDate;
	private Float tenure;
	private String status;
	
	
	
	public LoanDto() {
	}
	
	public LoanDto(Integer loanId, Integer customerId, String loanType, Double loanAmount, Double pendingAmount,
			Float intrestRate, LocalDate startDate, Float tenure, String status) {
		this.loanId = loanId;
		this.customerId = customerId;
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
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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
