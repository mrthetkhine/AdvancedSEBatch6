package com.turing.advancedse6.designpattern.decorator;

public abstract class LogDecorator implements Logger {
	Logger logger;
	public LogDecorator(Logger logger)
	{
		this.logger = logger;
	}
	public abstract String log(String message);
	
	
	
}
