package com.banking.mapper;

import com.banking.dto.AddressDto;
import com.banking.dto.BranchDto;
import com.banking.entity.Address;
import com.banking.entity.Branch;

public class BranchMapper {
	public static Branch mapToBranch(BranchDto branchDto) {
		Address address=AddressMapper.mapToAddress(branchDto.getAddress());
		return new Branch(branchDto.getBranchId(),
				branchDto.getBranchName(),branchDto.getBranchCode(),address);
	}
	
	public static BranchDto mapToBranchDto(Branch branch) {
		AddressDto addressDto=AddressMapper.mapToAddressDto(branch.getAddress());
		return new BranchDto(branch.getBranchId(),
				branch.getBranchName(),
				branch.getBranchCode(),
				addressDto);
	}
}
