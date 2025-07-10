package com.karunya.assignment3;

public class Executor {
	public static void main(String[] agrs) {
		Bank bank1 = new Bank();
		Bank bank2 = new Bank();
		
		System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());
		
		Account Savings = new SavingsAccount(1000);
		Account checking = new CheckingAccount(500);
		
		Transaction transaction = new Transaction();
		
		transaction.performTransaction(Savings, 200, "deposit");
		transaction.performTransaction(Savings, 100, "withdraw");
		
		transaction.performTransaction(checking, 300, "deposite");
		transaction.performTransaction(checking, 700, "withdraw");
		
		System.out.println("Final Savings Balance: " + Savings.getBalance());
		System.out.println("Final Checking Balance: " + checking.getBalance());
	}

}
