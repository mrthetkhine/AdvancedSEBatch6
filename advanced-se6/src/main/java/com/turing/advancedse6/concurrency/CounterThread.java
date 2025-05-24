package com.turing.advancedse6.concurrency;

public class CounterThread extends Thread {

	String name;
	Data data;
	
	public CounterThread(String name, Data data)
	{
		this.name= name;
		this.data = data;
	}
	public void run()
	{
		for(int i=0;i< 100_000;i++)
		{
			synchronized(this.data)
			{
				this.data.value++;
			}
			
		}
	}
}
