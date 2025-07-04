package com.turing.advancedse6.designpattern.stratergy;

class NumberStrategy implements Comparator<Integer>
{

	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		System.out.println("Compare a "+a +" b "+b);
		return a-b;
	}
	}
public class StrategyDemo {
	public static void main(String[]args)
	{
		Collection<Integer> ints = new Collection<>();
		
		ints.add(10);
		ints.add(30);
		ints.add(11);
		
		ints.sort(new NumberStrategy());
		
		for(Integer i : ints.items)
		{
			System.out.println("Item "+i);
		}
	}
}
