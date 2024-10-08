package com.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
//	@Query("SELECT a FROM Account a WHERE a.customer.id = :customerId")
//	List<Account> findAccountsByCustomerId(@Param("customerId") Integer customerId);
	
	List<Account> findAllByCustomer_CustomerId(Integer customerId);
	List<Account> findAllByBranch_BranchId(Integer branchId);
}


