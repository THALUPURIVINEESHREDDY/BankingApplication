package com.banking.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class TranscationDto {
	private Integer transcationId;
	private double amount;
	@JsonFormat(shape = Shape.STRING,pattern = "yyyy-MM-dd")
	private LocalDate transcationDate;
	private String transcationType;
	private String description;
	
	private Integer accountId;
	public TranscationDto() {
	}
	public TranscationDto(Integer transcationId, double amount, LocalDate transcationDate, String transcationType,
			String description,Integer accountId) {
		this.transcationId = transcationId;
		this.amount = amount;
		this.transcationDate = transcationDate;
		this.transcationType = transcationType;
		this.description = description;
		this.accountId=accountId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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
