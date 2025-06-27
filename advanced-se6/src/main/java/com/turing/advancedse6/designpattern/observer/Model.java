package com.turing.advancedse6.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Model implements Publisher{
	List<Subscriber> subscribers = new ArrayList<>();

	String name;
	Model(String name)
	{
		this.name = name;
	}
	@Override
	public void attach(Subscriber sub) {
		this.subscribers.add(sub);
		
	}

	@Override
	public void detach(Subscriber sub) {
		this.subscribers.remove(sub);
		
	}

	@Override
	public void notify(String message) {
		System.out.println("Publisher got message");
		for(Subscriber sub : this.subscribers)
		{
			sub.update(message);
		}
		
	}

}
