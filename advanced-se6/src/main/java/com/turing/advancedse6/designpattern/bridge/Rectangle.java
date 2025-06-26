package com.turing.advancedse6.designpattern.bridge;

public class Rectangle extends Shape{

	public Rectangle(DrawingApi api)
	{
		super(api);
	}
	@Override
	void draw() {
		this.api.drawRectangle();
		
	}

}
