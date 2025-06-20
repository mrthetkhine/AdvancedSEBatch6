package com.turing.advancedse6.abstractfactory;

public class IosTextBox extends UIRoot implements TextBox{

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "Android TextBox";
	}

	@Override
	void paint() {
		System.out.println("Android Text Box");
		
	}

}
