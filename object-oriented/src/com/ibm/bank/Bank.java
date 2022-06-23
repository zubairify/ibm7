package com.ibm.bank;

public interface Bank {
	// Constants of the application
	int INIT_ACNT_NO = 12001;
	double MIN_SAVINGS_BAL = 1000;
	double OPENING_CURRENT_BAL = 5000;
	double MIN_CURRENT_BAL = 0;
	double OVERDRAFT_LIMIT = 10000;
	
	// Behaviours of application
	void deposit(double amount);
	void withdraw(double amount);
	void summary();
	void statement();
}
