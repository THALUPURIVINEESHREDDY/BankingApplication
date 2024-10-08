
package com.banking.mapper;

import com.banking.dto.LoanDto;
import com.banking.entity.Customer;
import com.banking.entity.Loan;

public class LoanMapper {
	public static Loan mapToLoan(LoanDto loanDto,Customer customer) {
		return new Loan(
				loanDto.getLoanId(),
				customer,
				loanDto.getLoanType(),
				loanDto.getLoanAmount(),
				loanDto.getPendingAmount(),
				loanDto.getIntrestRate(),
				loanDto.getStartDate(),
				loanDto.getTenure(),
				loanDto.getStatus()
			);
	}
	
	public static LoanDto maptoLoanDto(Loan loan) {
		return new LoanDto(
				loan.getLoanId(),
				loan.getCustomer().getCustomerId(),
				loan.getLoanType(),
				loan.getLoanAmount(),
				loan.getPendingAmount(),
				loan.getIntrestRate(),
				loan.getStartDate(),
				loan.getTenure(),
				loan.getStatus()
			);
	}
}
