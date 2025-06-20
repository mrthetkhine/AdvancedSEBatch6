package com.turing.advancedse6.abstractfactory;

public class IosUIFactory implements UIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new IosButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new IosTextBox();
	}

}
