package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer>{

}
