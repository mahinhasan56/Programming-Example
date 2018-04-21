package com.FaysalTask3;

public class Main {
	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		BankAccount acc3 = new BankAccount();
		acc1.setName("Mahin");
		acc1.setAccountID("101");
		acc1.setAddress("Shantinagor");
		acc1.setBalance(5000);
		acc2.setName("rakin");
		acc2.setAccountID("201");
		acc2.setAddress("Rafiqnagor");
		acc2.setBalance(8000);
		acc3.setName("fardin");
		acc3.setAccountID("301");
		acc3.setAddress("Maniknagor");
		acc3.setBalance(6000);
		acc1.addInterest(.7);
		acc3.addInterest(.7);

		System.out.println("name: " + acc1.getName() + " , " + acc2.getName() + " , " + acc3.getName());
		System.out.println(
				"Accountid = " + acc1.getAccountID() + " , " + acc2.getAccountID() + " , " + acc3.getAccountID());
		System.out.println("address = " + acc1.getAddress() + " , " + acc2.getAddress() + " , " + acc3.getAddress());
		System.out.println("balance = " + acc1.getBalance() + " , " + acc2.getBalance() + " , " + acc3.getBalance());

	}
}
