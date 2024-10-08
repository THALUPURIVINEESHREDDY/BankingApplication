package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.LoanTranscation;

public interface LoanTranscationRepository extends JpaRepository<LoanTranscation, Integer>{

}
