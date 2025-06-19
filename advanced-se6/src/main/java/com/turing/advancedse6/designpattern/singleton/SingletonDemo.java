package com.turing.advancedse6.designpattern.singleton;

public class SingletonDemo {
	public static void main(String[]args)
	{
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println("obj1==obj2 "+(obj1==obj2));
		
		Runtime rt = Runtime.getRuntime();
		Runtime rt2 = Runtime.getRuntime();
		
		System.out.println("rt==rt2 "+(rt==rt2));
	}
}
