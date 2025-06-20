package com.turing.advancedse6.designpattern.factorymethod;

public class SimpleFactoryDemo {
	public static void main(String[]args)
	{
		//SimpleFactory factory = new SimpleFactory();
		ConnectionFactory factory = new MySQLConnectionFactory();
		Connection conn = factory.create();
		conn.close();
		
		//java.sql.Connection;
		
	}
}
