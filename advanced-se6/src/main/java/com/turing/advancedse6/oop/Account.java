package com.turing.advancedse6.oop;

public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}
	public void debit(double amount)
	{
		if(this.balance>= amount && amount >0)
		{
			this.balance -= amount;
		}
		
	}
	public void credit(double amount)
	{
		if(amount >= 0)
		{
			this.balance += amount;
		}
		
	}
	
	
}
