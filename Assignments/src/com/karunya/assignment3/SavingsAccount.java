package com.karunya.assignment3;

public class SavingsAccount extends Account {
	
	public SavingsAccount(double initialBalance)
	{
		super(initialBalance);
	}
	
	@Override
	public void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposite " + amount + " into SavingsAccount.");
	}
	
	@Override
	public void withdraw(double amount)
	{
		if (balance >= amount)
		{
			balance -= amount;
			System.out.println("Withdraw " + amount + " from SavingsAccount.");
		}
		else
		{
			System.out.println("Insufficient funds in SavingsAccount.");
		}
	}
	
	@Override
	public double getBalance()
	{
		return balance;
	}
	
	

}
