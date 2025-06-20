package com.turing.advancedse6.designpattern.factorymethod;

public class SimpleFactory {
	//simple factory
	Connection createConnection(String dbType)
	{
		if("MySQL".equals(dbType))
		{
			return new MySQLConnection();
		}
		else
		{
			return new OracleConnection();
		}
	}
}
