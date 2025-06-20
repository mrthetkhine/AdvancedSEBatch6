package com.turing.advancedse6.abstractfactory;

public class AndroidUIFactory implements UIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new AndroidButton();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new AndroidTextBox();
	}

}
