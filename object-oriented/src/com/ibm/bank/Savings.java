package com.ibm.bank;

public class Savings extends Accounts {

	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAVINGS_BAL);
		
		txns = new Transaction[10];
		txns[idx ++] = new Transaction("Cr", balance, balance);
	}

	@Override
	public void withdraw(double amount) {
		if(amount < (balance - MIN_SAVINGS_BAL)) {
			balance -= amount;
			txns[idx ++] = new Transaction("Dr", amount, balance);
		} else
			System.out.println("Insufficient balance!");
	}
}
