package com.karunya.assignment3;

public class Transaction {
	private final double transactionFee = 2.0;
	
	public final void performTransaction(Account account, double amount, String type)
	{
		System.out.println("\n--- Transaction Start ---");
		if(type.equalsIgnoreCase("deposit")) 
		{
			account.deposit(amount);
		}
		else if(type.equalsIgnoreCase("withdraw"))
		{
			account.withdraw(amount + transactionFee);
			System.out.println("Transaction fee of " + transactionFee + "applied.");
		}
		else
		{
			System.out.println("Invalid transaction type.");
		}
		System.out.println("Balance after transaction: " + account.getBalance());
		System.out.println("--- Transaction End ---\n");
	}

}
