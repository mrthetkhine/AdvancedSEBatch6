package com.turing.advancedse6.adapter;

public class ObjectAdapter implements NewApi{

	OldApi api = new OldApi();
	@Override
	public void push(int a) {
		api.add(a);
		
	}

}
