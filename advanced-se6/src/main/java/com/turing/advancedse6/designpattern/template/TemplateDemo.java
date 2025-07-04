package com.turing.advancedse6.designpattern.template;

public class TemplateDemo {
	public static void main(String args[])
	{
		FrameworkAction action = new SaleAction();
		action.process();
		
		action = new OrderAction();
		action.process();
	}
}
