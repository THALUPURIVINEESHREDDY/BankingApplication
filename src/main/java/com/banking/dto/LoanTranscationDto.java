package com.banking.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class LoanTranscationDto {
	private Integer paymentId;
	private Integer loanId;
	private Double paymentAmount;
	@JsonFormat(shape = Shape.STRING,pattern = "yyyy-MM-dd")
	private LocalDate paymentDate;
	private String paymentStatus;
	
	
	public LoanTranscationDto() {
	}


	public LoanTranscationDto(Integer paymentId, Integer loanId, Double paymentAmount, LocalDate paymentDate,
			String paymentStatus) {
		this.paymentId = paymentId;
		this.loanId = loanId;
		this.paymentAmount = paymentAmount;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
	}


	public Integer getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}


	public Integer getLoanId() {
		return loanId;
	}


	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}


	public Double getPaymentAmount() {
		return paymentAmount;
	}


	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}


	public LocalDate getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
	
	
}
