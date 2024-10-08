package com.banking.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;


public class AccountDto {
	private Integer accountId;
	private Integer customerId;
	private Integer branchId;
	private String accountType;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyy-MM-dd")
	private LocalDate createdAt;
	private String status;
	private Double balance;
	
	
	public AccountDto() {
	}
	public AccountDto(Integer accountId, Integer customerId, Integer branchId, String accountType, LocalDate createdAt,
			String status, Double balance) {
		super();
		this.accountId = accountId;
		this.customerId = customerId;
		this.branchId = branchId;
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
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomer(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
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
