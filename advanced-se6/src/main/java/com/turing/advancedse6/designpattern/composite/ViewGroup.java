package com.turing.advancedse6.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class ViewGroup extends UIWidget{
	List<UIWidget> children = new ArrayList<>();

	ViewGroup(String name) {
		super(name);
		
	}
	void addChildren(UIWidget view)
	{
		this.children.add(view);
	}
	
	@Override
	public void paint() {
		System.out.println("Paint "+this.name);
		for(UIWidget child : this.children)
		{
			child.paint();
		}
		
	}
}
