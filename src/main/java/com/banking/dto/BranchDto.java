package com.banking.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BranchDto {
	private Integer branchId;
	private String branchName;
	 @JsonProperty("branchCode")
	private String branchCode;
	private AddressDto address;

	public BranchDto() {
	}

	public BranchDto(Integer branchId, String branchName, String ifsc, AddressDto address) {
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchCode = ifsc;
		this.address = address;
	}

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String ifsc) {
		this.branchCode = ifsc;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}
}
