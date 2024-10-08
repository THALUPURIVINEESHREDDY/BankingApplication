package com.banking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.dto.BranchDto;
import com.banking.service.BranchService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/Branch")
public class BranchController {
	
	private BranchService bs;
	public BranchController(BranchService bs) {
		this.bs = bs;
	}
	
	@PostMapping
	public ResponseEntity<BranchDto> addBranch(@RequestBody BranchDto branchDto){
		BranchDto bd=bs.addBranch(branchDto);
		return new ResponseEntity<>(bd,HttpStatus.OK);
	}
}
