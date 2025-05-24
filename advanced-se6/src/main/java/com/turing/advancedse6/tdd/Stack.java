package com.turing.advancedse6.tdd;

public class Stack {

	private int[] items;
	private int size= 0;
	static final int MAX_SIZE =10;
	int top = -1;
	
	public Stack()
	{
		this.items = new int[MAX_SIZE];
	}
	public int getSize() {
		return size;
	}

	public void push(int item) {
		this.items[++this.top] = item;
		this.size++;
	}

	public int peek() {
		
		return this.items[this.top];
	}
	public int pop() {
		
		this.size --;
		return this.items[this.top--];
	}

}
