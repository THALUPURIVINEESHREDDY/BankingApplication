
package com.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	List<Employee> findAllByBranch_BranchId(Integer BranchId);
}
