package com.turing.advancedse6.tdd.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RepeatedTestCase {

	
	@RepeatedTest(5)
	public void testRepeat()
	{
		double rand = Math.random();
		log.info("Random "+rand);
		assertTrue(rand>=0 && rand <=1);
		
	}
}
