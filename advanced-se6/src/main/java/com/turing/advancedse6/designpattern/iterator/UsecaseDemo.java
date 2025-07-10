package com.turing.advancedse6.designpattern.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UsecaseDemo {
	public static void main(String[]args)
	{
		List<String> items =new ArrayList<>();
		items.add("One");
		items.add("Two");
		
		for(String item : items)
		{
			System.out.println("Item "+item);
		}
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Hi");
		
		for(String item : set)
		{
			System.out.println("Item "+item);
		}
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Iterator "+iterator.next());
		}
	}
}
