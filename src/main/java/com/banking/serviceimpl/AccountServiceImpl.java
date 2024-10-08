package com.banking.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.banking.dto.AccountDto;
import com.banking.dto.BranchDto;
import com.banking.dto.CustomerDto;
import com.banking.entity.Account;
import com.banking.entity.Branch;
import com.banking.entity.Customer;
import com.banking.mapper.AccountMapper;
import com.banking.mapper.BranchMapper;
import com.banking.mapper.CustomerMapper;
import com.banking.repository.AccountRepository;
import com.banking.service.AccountService;
import com.banking.service.BranchService;
import com.banking.service.CustomerService;

@Service
public class AccountServiceImpl implements AccountService{

	
	private AccountRepository ar;
	private BranchService bs;
	private CustomerService cs;
	public AccountServiceImpl(AccountRepository ar,BranchService bs,CustomerService cs) {
		this.ar = ar;
		this.bs=bs;
		this.cs=cs;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		BranchDto branchDto=bs.getBranchById(accountDto.getBranchId());
		CustomerDto customerDto = cs.getCustomerById(accountDto.getCustomerId());
		Branch branch=BranchMapper.mapToBranch(branchDto);
		Customer customer=CustomerMapper.mapToCustomer(customerDto);
		Account account=AccountMapper.mapToAccount(accountDto, customer, branch);
		Account savedAccount=ar.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto updateAccount(AccountDto accountDto) {
		BranchDto branchDto=bs.getBranchById(accountDto.getBranchId());
		CustomerDto customerDto = cs.getCustomerById(accountDto.getCustomerId());
		Branch branch=BranchMapper.mapToBranch(branchDto);
		Customer customer=CustomerMapper.mapToCustomer(customerDto);
		Account account=AccountMapper.mapToAccount(accountDto, customer, branch);
		Account savedAccount=ar.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAccountById(Integer accountId) {
		Account savedAccount=ar.findById(accountId).get();
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public List<AccountDto> getAllAccountsOfCustomerById(Integer customerId) {
		List<Account> accountList=ar.findAllByCustomer_CustomerId(customerId);
		List<AccountDto> accountDtoList=accountList.stream()
				.map(obj->AccountMapper.mapToAccountDto(obj))
				.collect(Collectors.toList());
		return accountDtoList;
	}

	@Override
	public List<AccountDto> getAllAccountsOfBranchById(Integer branchId) {
		List<Account> accountList=ar.findAllByBranch_BranchId(branchId);
		List<AccountDto> accountDtoList=accountList.stream()
				.map(obj->AccountMapper.mapToAccountDto(obj))
				.collect(Collectors.toList());
		return accountDtoList;
	}

	@Override
	public void deleteAccountById(Integer accountId) {
		ar.deleteById(accountId);
	}

}
