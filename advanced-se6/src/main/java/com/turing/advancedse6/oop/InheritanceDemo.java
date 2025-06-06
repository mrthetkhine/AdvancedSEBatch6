package com.turing.advancedse6.oop;

public class InheritanceDemo {
	public static void main(String[]args)
	{
		Human h = new Teacher("U Hla",30);
		//h.walk();
		h.work();
		
		h = new Doctor("Soe Maung",40);
		//h.walk();
		h.work();
	}
}
