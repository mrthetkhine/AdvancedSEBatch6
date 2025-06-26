package com.turing.advancedse6.adapter;

public class AdapterDemo {
	public static void main(String[]args)
	{
		NewApi api = new ObjectAdapter();
		api.push(100);
	}
}
