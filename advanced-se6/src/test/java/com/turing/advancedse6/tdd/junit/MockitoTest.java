package com.turing.advancedse6.tdd.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class MockitoTest {

	@Test
	public void testMockito()
	{
		ArrayList list = mock(ArrayList.class);
		Mockito.when(list.size()).thenReturn(3);
		
		System.out.println("Size "+list.size());
		assertEquals(3,list.size());
	}
}
