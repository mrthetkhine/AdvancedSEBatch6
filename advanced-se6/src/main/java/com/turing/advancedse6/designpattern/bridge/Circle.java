package com.turing.advancedse6.designpattern.bridge;

public class Circle extends Shape{

	public Circle(DrawingApi api)
	{
		super(api);
	}
	@Override
	void draw() {
		this.api.drawCircle();
		
	}

}
