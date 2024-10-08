package com.banking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.entity.UserRole;

@RequestMapping("/login")
@CrossOrigin("*")
@RestController
public class UserLoginController {
	private UserService us;

	public UserLoginController(UserService us) {
		super();
		this.us = us;
	}

	@PostMapping("{userName},{password}")
	private ResponseEntity<UserRole> findUser(@PathVariable String userName,@PathVariableString password){
		
	}
}