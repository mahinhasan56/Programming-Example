package com.FaysalTask3;

public class BankAccount {
	public String name, address, accountID;
	double balance, interest;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String i) {
		accountID = i;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String a) {
		address = a;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double c) {
		balance = c;
	}

	public void addInterest(double i) {
		interest = balance * i;
		System.out.println("interst:" + interest);
	} // adds 7% of the balance

}