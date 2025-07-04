package com.turing.advancedse6.designpattern.stratergy;

class StringStrategy implements Comparator<String>
{

	@Override
	public int compare(String a, String b) {
		// TODO Auto-generated method stub
		System.out.println("Compare a "+a +" b "+b);
		return a.compareTo(b);
	}
}
public class StringSort {
	public static void main(String[]args)
	{
		Collection<String> strings = new Collection<>();
		
		strings.add("Orange");
		strings.add("Apple");
		strings.add("Banana");
		
		strings.sort(new StringStrategy());
		
		for(String i : strings.items)
		{
			System.out.println("Item "+i);
		}
	}
}
