package com.banking.mapper;

import com.banking.dto.CreditCardDto;
import com.banking.entity.CreditCard;
import com.banking.entity.Customer;

public class CreditCardMapper {
	public static CreditCard mapToCreditCard(CreditCardDto creditCardDto,Customer customer) {
		return new CreditCard(
				creditCardDto.getCardId(),
				customer,
				creditCardDto.getCardNumber(),
				creditCardDto.getCardLimit(),
				creditCardDto.getBalance(),
				creditCardDto.getStatus()
			);
	}
	
	
	public static CreditCardDto mapToCreditCardDto(CreditCard creditCard) {
		return new CreditCardDto(
				creditCard.getCardId(),
				creditCard.getCustomer().getCustomerId(),
				creditCard.getCardNumber(),
				creditCard.getCardLimit(),
				creditCard.getBalance(),
				creditCard.getStatus()
			);
	}
}
