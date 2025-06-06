package com.turing.advancedse6.oop;

public class Doctor extends Human{

	public Doctor(String name, int age) {
		super(name, age);
	}
	public void work()
	{
		System.out.println(this.name+ " treat patient");
	}
}
