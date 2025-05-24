package com.turing.advancedse6.concurrency;

public class SynchronizationProblemDemo {
	public static void main(String args[])
	{
		Data data = new Data();
		CounterThread t1 = new CounterThread("thread one",data);
		CounterThread t2 = new CounterThread("thread two",data);
		CounterThread t3 = new CounterThread("thread three",data);
		
		t1.start();
		t2.start();
		t3.start();
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Data "+data.value);
	}
}
