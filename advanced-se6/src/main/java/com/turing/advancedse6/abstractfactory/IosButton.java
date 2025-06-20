package com.turing.advancedse6.abstractfactory;

public class IosButton extends UIRoot implements Button {

	@Override
	public void click() {
		System.out.println("Button click");
		
	}

	@Override
	void paint() {
		System.out.println("IOS Button Paint");
	}

}
