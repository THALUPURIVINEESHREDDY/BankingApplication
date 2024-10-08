package com.banking.service;

import org.springframework.stereotype.Service;

import com.banking.dto.CustomerDto;

@Service
public interface CustomerService {
	CustomerDto addCustomer(CustomerDto customerDto);
	CustomerDto getCustomerById(Integer customerId);
	void deleteCustomerById(Integer customerId);
}

