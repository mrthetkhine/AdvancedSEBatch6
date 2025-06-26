package com.turing.advancedse6.designpattern.bridge;

public class CanvasApi implements DrawingApi{

	@Override
	public void drawCircle() {
		System.out.println("Canvas Circle");
		
	}

	@Override
	public void drawRectangle() {
		System.out.println("Canvas Rectangle");
		
	}

}
