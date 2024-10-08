package com.banking.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.banking.dto.TranscationDto;
import com.banking.entity.Account;
import com.banking.entity.Transcation;
import com.banking.mapper.TranscationMapper;
import com.banking.repository.AccountRepository;
import com.banking.repository.TranscationRepository;
import com.banking.service.TranscationService;

@Service
public class TranscationServiceImpl implements TranscationService {

	private TranscationRepository tr;
	private AccountRepository ar;
	
	public TranscationServiceImpl(TranscationRepository tr,AccountRepository ar) {
		this.tr = tr;
		this.ar=ar;
	}

	@Override
	public TranscationDto withdrawAmount(TranscationDto transcationDto) {
		Account account=ar.findById(transcationDto.getAccountId()).get();
		Transcation transcation=TranscationMapper.mapToTranscation(transcationDto, account);
		Transcation savedTranscation=tr.save(transcation);
		Double amount=account.getBalance()-savedTranscation.getAmount();
		account.setBalance(amount);
		ar.save(account);
		return TranscationMapper.mapToTranscationDto(savedTranscation);
	}

	@Override
	public TranscationDto depositAmount(TranscationDto transcationDto) {
		Account account=ar.findById(transcationDto.getAccountId()).get();
		Transcation transcation=TranscationMapper.mapToTranscation(transcationDto, account);
		Transcation savedTranscation=tr.save(transcation);
		Double amount=account.getBalance()+savedTranscation.getAmount();
		account.setBalance(amount);
		ar.save(account);
		return TranscationMapper.mapToTranscationDto(savedTranscation);
	}

	@Override
	public TranscationDto transferAmount(TranscationDto transcationDto, Integer accountId) {
		Account account=ar.findById(transcationDto.getAccountId()).get();
		Account receivedAccount=ar.findById(accountId).get();
		Transcation transcation=TranscationMapper.mapToTranscation(transcationDto, account);
		Transcation savedTranscation=tr.save(transcation);
		Double amount=account.getBalance()-savedTranscation.getAmount();
		Double updateAmount=receivedAccount.getBalance()+savedTranscation.getAmount();
		account.setBalance(amount);
		receivedAccount.setBalance(updateAmount);
		ar.save(account);
		ar.save(receivedAccount);
		return TranscationMapper.mapToTranscationDto(savedTranscation);
	}

	@Override
	public List<TranscationDto> getAllTranscationsByAccountId(Integer accountId) {
		List<Transcation> transList=tr.findAllByAccount_AccountId(accountId);
		return transList.stream().map(obj->TranscationMapper.mapToTranscationDto(obj)).toList();
	}
	
	

}
