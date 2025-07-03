package com.turing.advancedse6.designpattern.cors;

public class AuthHandler implements Handler{

	@Override
	public void doHandle(Request request, Response response) {
		System.out.println("Auth middleware ");
		if(!request.headers.containsKey("Authorization"))
		{
			System.out.println("No authorization header in middleware ");
			throw new RuntimeException("Auth exception");
		}
		
	}

}
