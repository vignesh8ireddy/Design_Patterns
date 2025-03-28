package com.vignesh.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	public static Connection getInstance() {
		
		Properties properties = null;
		Connection connection = null;

		try {
			
			InputStream is = new FileInputStream("src/com/vignesh/properties/jdbc.properties");
			properties = new Properties();
			properties.load(is);			
		
			connection = DriverManager.getConnection(properties.getProperty("jdbc.url"),properties.getProperty("jdbc.username"),
															properties.getProperty("jdbc.password"));
		}
		
		catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return connection;
		
	}
	


}
