package com.turing.advancedse6.designpattern.cors;

public class LoggingHandler implements Handler{

	@Override
	public void doHandle(Request request, Response response) {
		System.out.println("Log request "+ request.getUrl());
		
	}

}
