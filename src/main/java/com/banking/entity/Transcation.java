package com.banking.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Transcation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transcationId;
	private double amount;
	private LocalDate transcationDate;
	private String transcationType;
	private String description;
	@ManyToOne
	@JoinColumn(name="accountId")
	private Account account;
	public Transcation() {
	}
	public Transcation(Integer transcationId, double amount, LocalDate transcationDate, String transcationType,
			String description,Account account) {
		this.transcationId = transcationId;
		this.amount = amount;
		this.transcationDate = transcationDate;
		this.transcationType = transcationType;
		this.description = description;
		this.account=account;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Integer getTranscationId() {
		return transcationId;
	}
	public void setTranscationId(Integer transcationId) {
		this.transcationId = transcationId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getTranscationDate() {
		return transcationDate;
	}
	public void setTranscationDate(LocalDate transcationDate) {
		this.transcationDate = transcationDate;
	}
	public String getTranscationType() {
		return transcationType;
	}
	public void setTranscationType(String transcationType) {
		this.transcationType = transcationType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
