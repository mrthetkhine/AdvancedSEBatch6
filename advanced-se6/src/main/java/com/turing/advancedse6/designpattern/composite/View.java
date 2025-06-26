package com.turing.advancedse6.designpattern.composite;
//Leaf
public class View extends UIWidget{

	public View(String viewName)
	{
		super(viewName);
	}
	@Override
	public void paint() {
		
		System.out.println("Paint "+this.name);
	}

}
