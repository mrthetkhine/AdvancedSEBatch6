package com.turing.advancedse6.designpattern.observer;

public class Demo {
	public static void main(String[]args)
	{
		Publisher model = new Model("model");
		
		Subscriber view1 = new View("view1");
		Subscriber view2 = new View("view2");
		Subscriber view3 = new View("view3");
		
		model.attach(view1);
		model.attach(view2);
		model.attach(view3);
		
		model.notify("Update 1");
		
		model.detach(view3);
		model.notify("Update 2");
		
	}
}
