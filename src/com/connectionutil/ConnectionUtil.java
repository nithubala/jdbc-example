package com.connectionutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	
	
	private static final String DRIVER ="com.mysql.jdbc.Driver" ;
	private static final String url = "jdbc:mysql://localhost:3306/nithyadb";
	private static final String username = "root";
	private static final String password = "root";

	public static Connection getConnection() 
	{
		try{
			Class.forName(DRIVER);
			Connection con=DriverManager.getConnection(url,username,password);
			return con ;
		
	}

	catch(SQLException | ClassNotFoundException e) {
		// TODO Auto-generated method stub
		e.printStackTrace();
	}
		return null;
		
	}


	

}
