package com.turing.advancedse6.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogString extends Computer{

	String logString = "";
	void readBootSector()
	{
		logString+= "readBootSector ";
		
	}
	void loadIntoMemory()
	{
		logString+= "loadIntoMemory ";
		
		
	}
	void runInCpu()
	{
		logString += "runInCpu ";
		
		
	}
	
	@Test
	public void testSequence()
	{
		Computer compu = this;
		compu.start();
		
		assertEquals("readBootSector loadIntoMemory runInCpu ",logString);
	}
}
