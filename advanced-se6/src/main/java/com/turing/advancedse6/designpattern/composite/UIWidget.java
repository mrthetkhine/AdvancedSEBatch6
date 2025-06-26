package com.turing.advancedse6.designpattern.composite;

public abstract class UIWidget {
	String name;
	UIWidget(String name)
	{
		this.name = name;
	}
	public abstract void  paint();
	void addChildren(UIWidget view)
	{
		
	}
}
