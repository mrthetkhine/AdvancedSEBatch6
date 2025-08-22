package com.turing.advancedse6.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	BinarySearch algo = new BinarySearch();
	
	@Test
	public void testBaseCase()
	{
		int arr[] = {};
		
		assertEquals(-1,algo.search(arr,10));
	}
	@Test
	public void testSingleItem()
	{
		int arr[] = {10};
		assertEquals(0,algo.search(arr,10));
		
		int []arr2 = {20};
		assertEquals(0,algo.search(arr2,20));
	}
	@Test
	public void testTwoItem()
	{
		int arr[] = {10,20};
		assertEquals(0,algo.search(arr,10));
		
		//int []arr2 = {20};
		assertEquals(1,algo.search(arr,20));
	}
	@Test
	public void testThreeItem()
	{
		int arr[] = {10,20,25};
		assertEquals(0,algo.search(arr,10));
		
		//int []arr2 = {20};
		assertEquals(1,algo.search(arr,20));
		assertEquals(2,algo.search(arr,25));
		assertEquals(-1,algo.search(arr,18));
		assertEquals(-1,algo.search(arr,30));
	}
}
