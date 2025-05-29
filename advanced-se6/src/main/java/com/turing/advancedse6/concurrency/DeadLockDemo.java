package com.turing.advancedse6.concurrency;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class DeadLockDemo {
	public static void main(String[]args)
	{
		Lock lock =new ReentrantLock();
		Data data = new Data();
		CounterThreadWithLock t1 = new CounterThreadWithLock("thread one",lock,data);
		CounterThreadWithLock t2 = new CounterThreadWithLock("thread two",lock,data);
		CounterThreadWithLock t3 = new CounterThreadWithLock("thread three",lock,data);
		
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
