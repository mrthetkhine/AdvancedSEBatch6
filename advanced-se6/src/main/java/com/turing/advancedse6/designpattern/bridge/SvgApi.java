package com.turing.advancedse6.designpattern.bridge;

public class SvgApi implements DrawingApi{

	@Override
	public void drawCircle() {
		System.out.println("SVG Circle");
		
	}

	@Override
	public void drawRectangle() {
		System.out.println("SVG Rectangle");
		
	}

}
