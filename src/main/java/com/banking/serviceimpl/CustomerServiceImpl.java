package com.banking.serviceimpl;

import org.springframework.stereotype.Service;

import com.banking.dto.CustomerDto;
import com.banking.entity.Customer;
import com.banking.mapper.CustomerMapper;
import com.banking.repository.CustomerRepository;
import com.banking.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository cr;
	
	public CustomerServiceImpl(CustomerRepository cr) {
		this.cr = cr;
	}

	@Override
	public CustomerDto addCustomer(CustomerDto customerDto) {
		Customer customer=CustomerMapper.mapToCustomer(customerDto);
		Customer savedCustomer = cr.save(customer);
		return CustomerMapper.mapToCustomerDto(savedCustomer);
	}

	@Override
	public CustomerDto getCustomerById(Integer customerId) {
		Customer customer=cr.findById(customerId).get();
		return CustomerMapper.mapToCustomerDto(customer);
	}

	@Override
	public void deleteCustomerById(Integer customerId) {
		cr.deleteById(customerId);		
	}

}
