package com.FaysalTask13;

public class CheckingAccount extends Account {
	static int numberOfAccount = 0;
	public double balance;

	public CheckingAccount() {
		super(0);
	}

	public CheckingAccount(double balance) {
		super(balance);
		this.balance = balance;

	}

	public double getBalance() {
		numberOfAccount++;
		return balance;
	}

}