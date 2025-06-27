package com.turing.advancedse6.designpattern.observer;

public class View implements Subscriber{

	String name;
	public View(String name)
	{
		this.name = name;
	}
	@Override
	public void update(String message) {
		System.out.println("View "+this.name+" update "+message);
		
	}

}
