package com.turing.advancedse6.oop;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TransferService {
	//just for demo purpose
	Account fromAccount;
	Account toAccount;
	public TransferService(Account fromAccount,Account toAccount)
	{
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
	}
	public void transfer(int amount)
	{
		this.fromAccount.debit(amount);
		log.info("Another line between debit and credit");
		this.toAccount.credit(amount);
		
		
	}
}
