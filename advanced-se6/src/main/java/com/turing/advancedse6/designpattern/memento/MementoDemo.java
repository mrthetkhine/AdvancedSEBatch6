package com.turing.advancedse6.designpattern.memento;

public class MementoDemo {
	public static void main(String[]args)
	{
		Originator org = new Originator("hi", "hello");
		org.process("Update hi");
		Memento snapshot = org.save();
		
		//System.out.println("Snapshot "+snapshot.state.data1);
		org.process("ANother");
		org.restore(snapshot);
		
		System.out.println("D1 "+org.state.data1);		
		System.out.println("D2 "+org.state.data2);		
	}
}
