package com.turing.advancedse6.oop;

public class Human {
	String name;
	int age;
	
	public Human(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public void work()
	{
		
	}
	public void walk()
	{
		System.out.println(this.name + " walks ");
	}
	public void eat()
	{
		System.out.println(this.name + " eat ");
	}
}
