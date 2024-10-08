package com.banking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.dto.EmployeeDto;
import com.banking.service.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/Employee")
public class EmployeeController {
	private EmployeeService es;
	public EmployeeController(EmployeeService es) {
		this.es=es;
	}
	
	@PostMapping
	public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employeeDto){
		EmployeeDto savedEmployee=es.addEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee,HttpStatus.OK);
	}
}
