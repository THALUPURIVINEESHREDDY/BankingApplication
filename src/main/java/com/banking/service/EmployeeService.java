package com.banking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.banking.dto.EmployeeDto;

@Service
public interface EmployeeService {
	EmployeeDto addEmployee(EmployeeDto employeeDto);
	EmployeeDto getEmployeeById(Integer empId);
	void deleteEmployee(Integer empId);
	List<EmployeeDto> getEmployeesByBranch(Integer branchId);
	EmployeeDto updateEmployee(EmployeeDto employeeDto);
}
