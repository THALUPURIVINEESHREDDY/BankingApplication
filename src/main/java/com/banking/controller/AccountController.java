package com.banking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.dto.AccountDto;
import com.banking.service.AccountService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/Account")
public class AccountController {
	private AccountService as;

	public AccountController(AccountService as) {
		super();
		this.as = as;
	}
	
	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
		AccountDto savedAccount=as.createAccount(accountDto);
		return new ResponseEntity<>(savedAccount,HttpStatus.OK);
	}
}
