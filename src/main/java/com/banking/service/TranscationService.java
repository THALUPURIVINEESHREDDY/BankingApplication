package com.banking.service;

import java.util.List;

import com.banking.dto.TranscationDto;

public interface TranscationService {
	TranscationDto withdrawAmount(TranscationDto transcationDto);
	TranscationDto depositAmount(TranscationDto transcationDto);
	TranscationDto transferAmount(TranscationDto transcationDto,Integer accountId);
	List<TranscationDto> getAllTranscationsByAccountId(Integer accountId);
}
