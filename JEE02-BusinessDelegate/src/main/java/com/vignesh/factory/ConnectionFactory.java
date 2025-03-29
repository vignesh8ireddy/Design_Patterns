package com.vignesh.factory;

import java.sql.Connection;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionFactory {
	
	private static String dsJndi;
	
	static {
		try {
			ResourceBundle resourceBundle = ResourceBundle.getBundle("com/vignesh/properties/jdbc");
			dsJndi = resourceBundle.getString("datasource.jndi");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getPooledJdbcConnection() {
		Connection connection = null;
		
		try {
			InitialContext initialContext = new InitialContext();
			DataSource dataSource = (DataSource) initialContext.lookup(dsJndi);
			connection = dataSource.getConnection();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}

}
