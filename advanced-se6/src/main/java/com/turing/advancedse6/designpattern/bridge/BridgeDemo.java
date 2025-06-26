package com.turing.advancedse6.designpattern.bridge;

public class BridgeDemo {
	public static void main(String[]args)
	{
		DrawingApi api = new SvgApi();
		
		Shape shape = new Circle(api);
		shape.draw();
		
		shape =new Rectangle(api);
		shape.draw();
	}
}
