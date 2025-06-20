package com.turing.advancedse6.designpattern.factorymethod;

public class MySQLConnection implements Connection{

	MySQLConnection()
	{
		System.out.println("MySQLConnection");
	}
	@Override
	public void open() {
		System.out.println("MySQL Connection opened");
		
	}
	@Override
	public void close() {
		System.out.println("MySQL Connection closed");
		
	}

	
	

}
