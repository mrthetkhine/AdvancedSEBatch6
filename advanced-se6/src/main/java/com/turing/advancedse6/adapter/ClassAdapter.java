package com.turing.advancedse6.adapter;

public class ClassAdapter extends OldApi implements NewApi{

	@Override
	public void push(int a) {
		super.add(a);
		
	}

}
