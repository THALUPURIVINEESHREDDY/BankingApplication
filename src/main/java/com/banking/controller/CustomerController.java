package com.banking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.dto.CustomerDto;
import com.banking.service.CustomerService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/Customer")
public class CustomerController {
	
	private CustomerService cs;

	public CustomerController(CustomerService cs) {
		this.cs = cs;
	}
	
	@PostMapping
	public ResponseEntity<CustomerDto> addCustomer(@RequestBody CustomerDto customerDto){
		CustomerDto savedCustomerDto=cs.addCustomer(customerDto);
		return new ResponseEntity<>(savedCustomerDto,HttpStatus.OK);
	}
}
