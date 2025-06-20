package com.turing.advancedse6.designpattern.factorymethod;

public class OracleConnectionFactory implements ConnectionFactory {

	@Override
	public Connection create() {
	
		return new OracleConnection();
	}

}
