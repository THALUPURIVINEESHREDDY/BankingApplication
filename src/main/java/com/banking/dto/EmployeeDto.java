package com.banking.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeDto {
		private Integer empId;
		private String firstName;
		private String lastName;
		private String email;
		private Long phoneNum;
		private String role;
		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
		private LocalDate hireDate;
		
		private Integer branchId;
		
		public EmployeeDto() {
			
		}
		public EmployeeDto(Integer empId, String firstName, String lastName, String email, Long phoneNum, String role,
				LocalDate hireDate,Integer branchId) {
			this.empId = empId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNum = phoneNum;
			this.role = role;
			this.hireDate = hireDate;
			this.branchId=branchId;
		}
		public Integer getEmpId() {
			return empId;
		}
		public void setEmpId(Integer empId) {
			this.empId = empId;
		}
		public Integer getBranchId() {
			return branchId;
		}
		public void setBranchId(Integer branchId) {
			this.branchId = branchId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Long getPhoneNum() {
			return phoneNum;
		}
		public void setPhoneNum(Long phoneNum) {
			this.phoneNum = phoneNum;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public LocalDate getHireDate() {
			return hireDate;
		}
		public void setHireDate(LocalDate hireDate) {
			this.hireDate = hireDate;
		}
}
