package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer>{

}
