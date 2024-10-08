package com.banking.mapper;

import com.banking.dto.EmployeeDto;
import com.banking.entity.Branch;
import com.banking.entity.Employee;

public class EmployeeMapper {
	public static Employee mapToEmployee(EmployeeDto employeeDto,Branch branch) {
		return new Employee(
				employeeDto.getEmpId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail(),
				employeeDto.getPhoneNum(),
				employeeDto.getRole(),
				employeeDto.getHireDate(),
				branch
				);
	}
	
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		return new EmployeeDto(
				employee.getEmpId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getPhoneNum(),
				employee.getRole(),
				employee.getHireDate(),
				employee.getBranch().getBranchId()
			);
	}
}
