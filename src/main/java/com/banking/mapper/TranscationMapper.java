package com.banking.mapper;

import com.banking.dto.TranscationDto;
import com.banking.entity.Account;
import com.banking.entity.Transcation;

public class TranscationMapper {
	public static Transcation mapToTranscation(TranscationDto transcationDto,Account account) {
		return new Transcation(
				transcationDto.getTranscationId(),
				transcationDto.getAmount(),
				transcationDto.getTranscationDate(),
				transcationDto.getTranscationType(),
				transcationDto.getDescription(),
				account
		);
	}
	
	public static TranscationDto mapToTranscationDto(Transcation transcation) {
		
		return new TranscationDto(
				transcation.getTranscationId(),
				transcation.getAmount(),
				transcation.getTranscationDate(),
				transcation.getTranscationType(),
				transcation.getDescription(),
				transcation.getAccount().getAccountId()
		);
	}
}
