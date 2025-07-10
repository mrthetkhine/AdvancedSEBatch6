package com.turing.advancedse6.designpattern.memento;

public class Memento {
	State state;
	public void saveMemento(State state)
	{
		this.state = state;
	}
	public State getState()
	{
		return this.state;
	}
	
}
