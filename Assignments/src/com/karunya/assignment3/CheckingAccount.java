package com.karunya.assignment3;

public class CheckingAccount extends Account {
	public CheckingAccount(double initialBalance)
	{
		super(initialBalance);
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + " into CheckingAccount."); 
		
	}

	@Override
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Withdraw " + amount + " from CheckingAccount");
		}else {
			System.out.println("Insufficient funds in CheckingAccount.");
		}
		
	}

	@Override
	public double getBalance() {
		return balance;
	}

}
