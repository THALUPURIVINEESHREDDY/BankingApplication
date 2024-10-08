package com.banking.mapper;

import com.banking.dto.AccountDto;
import com.banking.entity.Account;
import com.banking.entity.Branch;
import com.banking.entity.Customer;

public class AccountMapper {
	public static Account mapToAccount(AccountDto accountdto,Customer customer,Branch branch) {
		return new Account(
				accountdto.getAccountId(),
				customer,
				branch,
				accountdto.getAccountType(),
				accountdto.getCreatedAt(),
				accountdto.getStatus(),
				accountdto.getBalance()
			);
	}
	
	
	public static AccountDto mapToAccountDto(Account account) {
		return new AccountDto(
				account.getAccountId(),
				account.getCustomer().getCustomerId(),
				account.getBranch().getBranchId(),
				account.getAccountType(),
				account.getCreatedAt(),
				account.getStatus(),
				account.getBalance()
			);
		
	}
}
