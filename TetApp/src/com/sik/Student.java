package com.sik;

public class Student {

	private int empId;
	private String empName;
	private double sal;

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

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
		return "Student [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}

	public double calculateInterest() {
		System.out.println("Interest Calculation : ");
		double time = 4;
		double rs = 5000;
		double per = 4;
		return rs * time * 4 / 100.0;
	}
}