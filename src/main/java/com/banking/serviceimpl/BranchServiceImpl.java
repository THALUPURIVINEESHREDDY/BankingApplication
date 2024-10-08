package com.banking.serviceimpl;

import org.springframework.stereotype.Service;

import com.banking.dto.BranchDto;
import com.banking.entity.Branch;
import com.banking.mapper.BranchMapper;
import com.banking.repository.BranchRepository;
import com.banking.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService{

	private BranchRepository br;
	
	
	public BranchServiceImpl(BranchRepository br) {
		this.br = br;
	}

	@Override
	public BranchDto addBranch(BranchDto branchDto) {
		
		Branch branch=BranchMapper.mapToBranch(branchDto);
		Branch savedBranch=br.save(branch);
		return BranchMapper.mapToBranchDto(savedBranch);
	}

	@Override
	public BranchDto getBranchById(Integer branchId) {
		Branch branch=br.findById(branchId).get();
		return BranchMapper.mapToBranchDto(branch);
	}


	@Override
	public void deleteBranch(Integer branchId) {
		br.deleteById(branchId);
	}

}
