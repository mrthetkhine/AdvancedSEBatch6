package com.turing.advancedse6.designpattern.factorymethod;

public class MySQLConnectionFactory implements ConnectionFactory {

	@Override
	public Connection create() {
	
		return new MySQLConnection();
	}

}
