package com.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Transcation;

public interface TranscationRepository extends JpaRepository<Transcation, Integer>{
	List<Transcation> findAllByAccount_AccountId(Integer customerId);
}
