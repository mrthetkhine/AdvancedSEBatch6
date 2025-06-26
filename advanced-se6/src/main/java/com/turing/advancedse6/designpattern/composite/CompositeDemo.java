package com.turing.advancedse6.designpattern.composite;

public class CompositeDemo {
	public static void main(String[]args)
	{
		UIWidget root = new ViewGroup("Root");
		root.addChildren(new View("TextBox"));
		root.addChildren(new View("Label"));
		
		UIWidget secondContainer = new ViewGroup("Second container");
		secondContainer.addChildren(new View("Second->Label"));
		secondContainer.addChildren(new View("Second->Textbox"));
		
		root.addChildren(secondContainer);
		
		root.paint();
	}
}
