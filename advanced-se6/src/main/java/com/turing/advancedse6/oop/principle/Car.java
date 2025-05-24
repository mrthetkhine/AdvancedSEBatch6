package com.turing.advancedse6.oop.principle;

public class Car {
	Engine engine;
	
	public Car(Engine engine)
	{
		this.engine = engine;
	}
	public void start()
	{
		System.out.println("Car start");
		this.engine.start();
	}
}
