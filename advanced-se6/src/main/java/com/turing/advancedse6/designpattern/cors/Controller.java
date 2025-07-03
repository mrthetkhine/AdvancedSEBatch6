package com.turing.advancedse6.designpattern.cors;

public class Controller implements Handler{

	@Override
	public void doHandle(Request request, Response response) {
		System.out.println("Doing business logic for "+request.getUrl());
		
	}

}
