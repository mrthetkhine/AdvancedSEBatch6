package com.turing.advancedse6.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StackTest {
	Stack stack = new Stack();
	
	@Test
	public void testSize()
	{
		
		int size = stack.getSize();
		
		assertEquals(0,size);
	}
	@Test
	public void testSizeAfterPush()
	{
		stack.push(10);
		
		int size = stack.getSize();
		
		assertEquals(1,size);
	}
	@Test
	public void testSizeAfterPushTwo()
	{
		stack.push(10);
		stack.push(20);
		
		int size = stack.getSize();
		
		assertEquals(2,size);
	}
	@Test
	public void testPushBaseCase()
	{
		int orgSize = stack.getSize();
		stack.push(100);
		
		assertEquals(orgSize+1,stack.getSize());
		assertEquals(100,stack.peek());
	}
	@Test
	public void testPushBaseCase2()
	{
		int orgSize = stack.getSize();
		stack.push(100);
		stack.push(200);
		
		assertEquals(orgSize+2,stack.getSize());
		assertEquals(200,stack.peek());
	}
	
	@Test
	public void testPopBase()
	{
		stack.push(10);
		
		int item = stack.pop();
		
		assertEquals(10,item);
		assertEquals(0,stack.getSize());
	}
	@Test
	public void testPopBaseCase2()
	{
		stack.push(20);
		stack.push(30);
		
		int item1 = stack.pop();
		int item2 = stack.pop();
		
		assertEquals(30,item1);
		assertEquals(20,item2);
		assertEquals(0,stack.getSize());
	}
}
