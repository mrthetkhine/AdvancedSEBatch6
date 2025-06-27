package com.turing.advancedse6.designpattern.flyweight;

public class StringDemo {
	public static void main(String[]args)
	{
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println("str1== str2 "+(str1==str2));
		
		Integer i = 127;
		Integer j = 127;
		System.out.println("i==j "+(i ==j));
		
		i = 128;
		j = 128;
		
		System.out.println("i==j "+(i ==j));
	}
}
