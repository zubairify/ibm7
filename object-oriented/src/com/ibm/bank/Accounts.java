package com.ibm.bank;

/**
 * This class represents generalised bank account.
 * @author Zubair Shaikh
 * @version 1.0
 */
public abstract class Accounts implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	
	private static int autogen = INIT_ACNT_NO;
	protected Transaction[] txns;
	protected int idx;
	
	/** Default constructor. */
	public Accounts() {
	}

	/**
	 * Parameterised constructor.
	 * @param holder
	 * @param balance
	 */
	public Accounts(String holder, double balance) {
		this.acntNo = autogen ++;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	
	// Business Logic Methods
	public void deposit(double amount) {
		balance += amount;
		txns[idx ++] = new Transaction("Cr", amount, balance);
	}
	
	public abstract void withdraw(double amount);
	
	public void statement() {
		System.out.println("Statement of A/C No: " + acntNo);
		for(int i=0; i<idx; i++)
			System.out.println(txns[i]);
	}
}
