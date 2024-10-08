package com.banking.mapper;
import com.banking.dto.LoanTranscationDto;
import com.banking.entity.Loan;
import com.banking.entity.LoanTranscation;


public class LoanTranscationMapper {
	public static LoanTranscation mapToLoanTranscation(LoanTranscationDto loanTranscationDto,Loan loan) {
		return new LoanTranscation(
				loanTranscationDto.getPaymentId(),
				loan,
				loanTranscationDto.getPaymentAmount(),
				loanTranscationDto.getPaymentDate(),
				loanTranscationDto.getPaymentStatus()
				);
	}
	
	
	public static LoanTranscationDto mapToLoanTranscationDto(LoanTranscation loanTranscation) {
		return new LoanTranscationDto(
				loanTranscation.getPaymentId(),
				loanTranscation.getLoan().getLoanId(),
				loanTranscation.getPaymentAmount(),
				loanTranscation.getPaymentDate(),
				loanTranscation.getPaymentStatus()
				);
	}
}
