package com.turing.advancedse6.designpattern.decorator;

import java.io.DataInputStream;

public class DecoratorDemo {
	public static void main(String[]args)
	{
		Logger logger =new HtmlDecorator(new TimeDecorator(new BasicLogger()));
		logger =new TimeDecorator(new BasicLogger());
		
		String message = logger.log("hello");
		System.out.println("Message "+message);
		
		//DataInputStream din;
	}
}
