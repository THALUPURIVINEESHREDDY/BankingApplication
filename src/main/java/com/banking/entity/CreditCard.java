package com.banking.entity;

public class CreditCard {
	private Integer cardId;
	private Customer customer;
	private Long cardNumber;
	private Double cardLimit;
	private Double balance;
	private String status;
	public CreditCard(Integer cardId, Customer customer, Long cardNumber, Double cardLimit, Double balance,
			String status) {
		super();
		this.cardId = cardId;
		this.customer = customer;
		this.cardNumber = cardNumber;
		this.cardLimit = cardLimit;
		this.balance = balance;
		this.status = status;
	}
	public CreditCard() {
		super();
	}
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Double getCardLimit() {
		return cardLimit;
	}
	public void setCardLimit(Double cardLimit) {
		this.cardLimit = cardLimit;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
