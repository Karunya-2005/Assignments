package com.karunya.assignment2;
import java.util.Scanner;
public class Commission {
	String name;
	String address;
	String phone;
	double salesAmount;
	
	//method for accept details
	void acceptDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		
		System.out.println("Enter Address: ");
		address = sc.nextLine();
		
		System.out.println("Enter Phone: ");
		phone = sc.nextLine();
		
		System.out.println("Enter Sales Amount: ");
		salesAmount = sc.nextDouble();
	}
	//method for calculate commission
	void calculateCommission()
	{
		double commission = 0;
		
		if(salesAmount >= 100000)
		{
			commission = salesAmount * 0.10;
		}	
		else if(salesAmount >= 50000)
		{
			commission = salesAmount * 0.05;
		}
		else if (salesAmount >= 30000)
		{
			commission = salesAmount * 0.03;
		}
		else
		{
			System.out.println("No commission for sales amount < 30,000.");
			return;
		}
		System.out.println("Commission for " + name + "is: " + commission);
	}

}
