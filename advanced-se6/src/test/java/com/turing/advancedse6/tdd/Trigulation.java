package com.turing.advancedse6.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Trigulation {
	@Test
	public void testAddition()
	{
		Arithmetic arith = new Arithmetic();
		assertEquals(4,arith.add(1,3));
		assertEquals(7,arith.add(4,3));
	}
}
