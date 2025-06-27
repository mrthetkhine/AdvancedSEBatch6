package com.turing.advancedse6.designpattern.observer;

public interface Publisher {
	void attach(Subscriber sub);
	void detach(Subscriber sub);
	void notify(String message);
}
