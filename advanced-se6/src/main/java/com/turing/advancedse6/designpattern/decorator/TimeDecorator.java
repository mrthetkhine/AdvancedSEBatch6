package com.turing.advancedse6.designpattern.decorator;
import java.util.Date;
public class TimeDecorator extends LogDecorator{

	public TimeDecorator(Logger logger)
	{
		super(logger);
	}
	@Override
	public String log(String message) {
		
		return (new Date())+ this.logger.log(message);
	}

}
