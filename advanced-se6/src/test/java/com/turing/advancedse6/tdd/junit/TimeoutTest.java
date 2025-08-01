package com.turing.advancedse6.tdd.junit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.*;
import static java.time.Duration.ofMillis;
import lombok.extern.slf4j.Slf4j;

class Api
{
	void process(long ms)
	{
		try
		{
			Thread.sleep(ms);
			System.out.println("Done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	int div(int a, int b)
	{
		return a/b;
	}
}
@Slf4j
public class TimeoutTest {
	
	Api api = new Api();
	//@Test
	public void testTimeout()
	{
		Api api = new Api();
		assertTimeout(ofMillis(2000),()->{
			api.process(2500);
		});
	}
	@Test
	public void testDiv()
	{
		
		ArithmeticException ae = assertThrows(ArithmeticException.class,()->{
			int result = api.div(10, 0);
		});
		log.info("Ae "+ae.getMessage());
		
		assertEquals("/ by zero",ae.getMessage());
	}
	//@Test
	void testExceptionIsNotThrown() {
	    assertDoesNotThrow(() -> {
	        log.info("Nomral code");
	        int result = 10/0;
	    });
	}
	@Test
	//@EnabledOnOs({ "LINUX", "MAC" })
	void onLinuxOrMac() {
	    // ...
	}

}
