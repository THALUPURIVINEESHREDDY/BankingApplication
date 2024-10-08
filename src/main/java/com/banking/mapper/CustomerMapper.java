package com.banking.mapper;

import com.banking.dto.CustomerDto;
import com.banking.entity.Customer;

public class CustomerMapper {
	public static CustomerDto mapToCustomerDto(Customer customer) {
		return new CustomerDto(
				customer.getCustomerId(),
				customer.getFirstName(),
				customer.getLastName(),
				customer.getEmail(),
				customer.getPhoneNum(),
				customer.getDob(),
				customer.getAddress(),
				customer.getCreatedAt()
			);
	}
	
	public static Customer mapToCustomer(CustomerDto customerDto) {
		return new Customer(
				customerDto.getCustomerId(),
				customerDto.getFirstName(),
				customerDto.getLastName(),
				customerDto.getEmail(),
				customerDto.getPhoneNum(),
				customerDto.getDob(),
				customerDto.getAddress(),
				customerDto.getCreatedAt()
			);
	}
}
