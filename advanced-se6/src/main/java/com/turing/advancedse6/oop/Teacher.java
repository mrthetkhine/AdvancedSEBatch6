package com.turing.advancedse6.oop;

public class Teacher extends Human{

	public Teacher(String name, int age) {
		super(name, age);
	}
	public void work()
	{
		System.out.println(this.name+ " teach");
	}
}
