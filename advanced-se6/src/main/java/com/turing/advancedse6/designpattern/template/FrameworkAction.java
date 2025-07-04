package com.turing.advancedse6.designpattern.template;

public abstract class FrameworkAction {
	void auth()
	{
		System.out.println("Authentication");
	}
	void logging()
	{
		System.out.println("Logging");
	}
	abstract void businessLogic();
	
	void process()
	{
		this.auth();
		this.logging();
		this.businessLogic();
	}
}
