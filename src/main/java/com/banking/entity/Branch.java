package com.banking.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer branchId;
	
	@Column(nullable=false,unique = true)
	private String branchName;
	
	@Column(nullable=false,unique = true)
	private String branchCode;
	
	@Embedded
	private Address address;

	public Branch() {
	}

	public Branch(Integer branchId, String branchName, String ifsc, Address address) {
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
