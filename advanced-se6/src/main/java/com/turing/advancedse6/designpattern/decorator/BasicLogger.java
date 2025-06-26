package com.turing.advancedse6.designpattern.decorator;

public class BasicLogger implements Logger{

	@Override
	public String log(String message) {
		return "Log "+message;
	}

}
