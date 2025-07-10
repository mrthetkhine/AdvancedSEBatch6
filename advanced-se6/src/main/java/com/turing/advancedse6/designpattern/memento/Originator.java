package com.turing.advancedse6.designpattern.memento;

public class Originator {
	State state;
	
	Originator(String d1,String d2)
	{
		this.state = new State();
		this.state.setData1(d1);
		this.state.setData2(d2);
	}
	Memento save()
	{
		Memento  memento = new Memento();
		
		State state = new State();
		state.setData1(this.state.data1);
		state.setData2(this.state.data2);
		
		memento.saveMemento(state);
		
		//System.out.println("Memento save "+memento.getState().data1);
		//System.out.println("Memento save "+memento.getState().data2);
		return memento;
	}
	void restore(Memento memento)
	{
		this.state = memento.getState();
		//System.out.println("Memento "+memento.getState().data1);
		//System.out.println("Memento "+memento.getState().data2);
	}
	void process(String d1)
	{
		this.state.setData1(d1);
	}
}
