package com.turing.advancedse6.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.turing.advancedse6.oop.principle.Car;
import com.turing.advancedse6.oop.principle.Engine;

public class SelfShunt extends Engine {

	boolean started = false;
	@Test
	public void testCar()
	{
		Car car = new Car(this);
		car.start();
		assertEquals(true, this.started);
	}

	@Override
	public void start() {
		this.started  = true;
		
	}
	
}
