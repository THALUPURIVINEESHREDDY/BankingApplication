package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer>{

}
