package com.turing.advancedse6.designpattern.iterator;

public class Demo {
	public static void main(String[]args)
	{
		Collection col = new Collection("Hello world");
		Iterator iterator = col.createIterator();
		while(iterator.hasNext())
		{
			System.out.println("Next "+iterator.next());
		}
	}
}
