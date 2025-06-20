package com.turing.advancedse6.abstractfactory;

public class AbstractFactoryDemo {
	public static void main(String[]args)
	{
		UIFactory factory = new IosUIFactory();
		
		Button button = factory.createButton();
		TextBox textBox = factory.createTextBox();
		
		button.click();
		System.out.println("GetText "+textBox.getText());
	}
}
