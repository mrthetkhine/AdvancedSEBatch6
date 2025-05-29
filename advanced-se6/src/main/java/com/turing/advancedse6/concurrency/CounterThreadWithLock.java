package com.turing.advancedse6.concurrency;

import java.util.concurrent.locks.Lock;

public class CounterThreadWithLock extends Thread {

	String name;
	Data data;
	Lock lock;
	public CounterThreadWithLock(String name, Lock lock, Data data)
	{
		this.name= name;
		this.data = data;
		this.lock = lock;
	}
	public void run()
	{
		for(int i=0;i< 100_000;i++)
		{
			
			this.lock.lock();
			this.data.value++;
			
			//this.lock.unlock();
		}
	}
}
