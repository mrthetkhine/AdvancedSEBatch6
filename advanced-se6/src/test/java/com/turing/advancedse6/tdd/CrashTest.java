package com.turing.advancedse6.tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrashTest {
	@Test
	void testCrash()
	{
		FullFile file = new FullFile("hello.txt");
		
		try {
			boolean result = file.createNewFile();
			fail();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
		
		
		/*
		assertThrows(IOException.class,()->{
			file.createNewFile();
		});
		*/
	}
}
