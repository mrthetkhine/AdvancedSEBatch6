package com.turing.advancedse6.designpattern.decorator;
import java.util.Date;
public class HtmlDecorator extends LogDecorator{

	public HtmlDecorator(Logger logger)
	{
		super(logger);
	}
	@Override
	public String log(String message) {
		
		return "<h1> "+ this.logger.log(message)+"</h1>";
	}

}
