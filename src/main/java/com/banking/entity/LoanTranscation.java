package com.banking.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class LoanTranscation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentId;
	@ManyToOne
	@JoinColumn(name="loanId")
	private Loan loan;
	private Double paymentAmount;
	private LocalDate paymentDate;
	private String paymentStatus;
	
	
	public LoanTranscation() {
		super();
	}


	public LoanTranscation(Integer paymentId, Loan loan, Double paymentAmount, LocalDate paymentDate,
			String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.loan = loan;
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


	public Loan getLoan() {
		return loan;
	}


	public void setLoan(Loan loan) {
		this.loan = loan;
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
