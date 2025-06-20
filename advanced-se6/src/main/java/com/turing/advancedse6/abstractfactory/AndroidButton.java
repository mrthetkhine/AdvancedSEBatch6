package com.turing.advancedse6.abstractfactory;

public class AndroidButton extends UIRoot implements Button {

	@Override
	public void click() {
		System.out.println("Button click");
		
	}

	@Override
	void paint() {
		System.out.println("Android Button Paint");
	}

}
