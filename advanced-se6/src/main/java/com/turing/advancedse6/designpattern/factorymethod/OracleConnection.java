package com.turing.advancedse6.designpattern.factorymethod;

public class OracleConnection implements Connection{

	OracleConnection()
	{
		System.out.println("OracleConnection");
	}
	@Override
	public void open() {
		System.out.println("OracleConnection Connection opened");
		
	}
	@Override
	public void close() {
		System.out.println("OracleConnection Connection closed");
		
	}

	
	

}
