package com.mph.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDBConnection {

	public static Connection con;
	public static Connection getDBConnection()
	{
		try {
			Class.forName("oracle.jdbc.driver.Orac"+ "leDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Prajwal1234");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		System.out.println(getDBConnection());

	}

}
