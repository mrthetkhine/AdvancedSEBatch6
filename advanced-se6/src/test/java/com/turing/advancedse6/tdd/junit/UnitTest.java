package com.turing.advancedse6.tdd.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

class Calaculator
{
	static int add(int a,int b)
	{
		return a +b;
	}
}
@Slf4j
public class UnitTest {
	
	@BeforeAll
    static void initAll() {
		log.info("Before all");
    }
	
	@BeforeEach
	void testBeforeEach()
	{
		log.info("Before each");
	}
	
	@Test
	public void testAdd()
	{
		int result = Calaculator.add(10, 2);
		assertEquals(12, result);
		log.info("Test Case1 "+this);
	}
	
	@Test
	@DisplayName("Custom test name containing spaces")
	public void testCase2()
	{
		log.info("Test Case2 "+this);
		//assertEquals(1,1+2);
	}
	
	@Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        log.info("Disabled");
    }
	
	@AfterEach
	public void tearDown()
	{
		log.info("After each Tear down ");
		
	}
	
	@AfterAll
	static void testAferAll()
	{
		log.info("After all tear down all");
	}
	
}
