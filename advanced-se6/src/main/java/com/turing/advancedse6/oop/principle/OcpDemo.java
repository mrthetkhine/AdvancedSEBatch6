package com.turing.advancedse6.oop.principle;

public class OcpDemo {
	public static void main(String[]args)
	{
		Engine engine = new DieselEngine();
		Car car = new Car(engine);
		car.start();
	}
}
