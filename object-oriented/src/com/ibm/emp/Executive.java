package com.ibm.emp;

public class Executive extends Employee {
	private double incentives;

	public Executive() {
	}

	public Executive(String empName, double salary, double incentives) {
		super(empName, salary);	// Calls the parameterised constructor of super class
		this.incentives = incentives;
	}

	@Override
	public double getSalary() {
		return super.getSalary() + incentives;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Incetives: " + incentives);
	}
}
