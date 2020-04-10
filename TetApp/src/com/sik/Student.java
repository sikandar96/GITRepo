package com.sik;

public class Student {

	private int empId;
	private String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Student [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public double calculateInterest() {
		return 5.6;
	}
}