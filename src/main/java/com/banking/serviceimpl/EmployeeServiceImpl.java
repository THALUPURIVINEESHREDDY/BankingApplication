package com.banking.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.banking.dto.BranchDto;
import com.banking.dto.EmployeeDto;
import com.banking.entity.Branch;
import com.banking.entity.Employee;
import com.banking.mapper.BranchMapper;
import com.banking.mapper.EmployeeMapper;
import com.banking.repository.EmployeeRepository;
import com.banking.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository er;
//	private BranchRepository br;
	private BranchServiceImpl bsi;
	
	public EmployeeServiceImpl(EmployeeRepository er,BranchServiceImpl bsi) {//,BranchRepository br) {
		this.er = er;
		this.bsi=bsi;
	}

	@Override
	public EmployeeDto addEmployee(EmployeeDto employeeDto) {
		
		System.out.println("b"+employeeDto.getBranchId());
		BranchDto branchDto=bsi.getBranchById(employeeDto.getBranchId());
		System.out.println("a"+branchDto.getBranchName()+" "+branchDto.getAddress().getAddress());
		Branch branch=BranchMapper.mapToBranch(branchDto);
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto,branch);
		Employee savedEmployee=er.save(employee);
		
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

	@Override
	public EmployeeDto getEmployeeById(Integer empId) {
		Employee employee=er.findById(empId).get();
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

	@Override
	public void deleteEmployee(Integer empId) {
		er.deleteById(empId);
	}

	@Override
	public List<EmployeeDto> getEmployeesByBranch(Integer branchId) {
		List<Employee> employeeList=er.findAllByBranch_BranchId(branchId);
		List<EmployeeDto> employeeDtoList=employeeList.stream().map(obj->EmployeeMapper.mapToEmployeeDto(obj)).toList();
		return employeeDtoList;
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
		Employee employee=er.findById(employeeDto.getEmpId()).get();
		Employee updatedemployee=EmployeeMapper.mapToEmployee(employeeDto, employee.getBranch());
		Employee savedEmployee=er.save(updatedemployee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

}
