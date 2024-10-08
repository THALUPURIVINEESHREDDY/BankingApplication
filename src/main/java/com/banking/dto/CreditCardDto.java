package com.banking.dto;

public class CreditCardDto {
	private Integer cardId;
	private Integer customerId;
	private Long cardNumber;
	private Double cardLimit;
	private Double balance;
	private String status;
	
	
	public CreditCardDto() {
		super();
	}
	public CreditCardDto(Integer cardId, Integer customerId, Long cardNumber, Double cardLimit, Double balance,
			String status) {
		super();
		this.cardId = cardId;
		this.customerId = customerId;
		this.cardNumber = cardNumber;
		this.cardLimit = cardLimit;
		this.balance = balance;
		this.status = status;
	}
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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
