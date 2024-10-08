package com.banking.service;

import com.banking.dto.BranchDto;

public interface BranchService {
	BranchDto addBranch(BranchDto branchDto);
	BranchDto getBranchById(Integer branchId);
	void deleteBranch(Integer branchId);
}
