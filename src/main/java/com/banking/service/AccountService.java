package com.banking.service;

import java.util.List;

import com.banking.dto.AccountDto;

public interface AccountService {
	AccountDto createAccount(AccountDto accountDto);
	AccountDto updateAccount(AccountDto accountDto);
	AccountDto getAccountById(Integer accountId);
	List<AccountDto> getAllAccountsOfCustomerById(Integer customerId);
	List<AccountDto> getAllAccountsOfBranchById(Integer branchId);
	void deleteAccountById(Integer accountId);
}


