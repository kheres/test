package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
	
	private static Connection connect;
	private static String url = "jdbc:mysql://127.0.0.1:3306/tpecommerce";
	private static String login = "root";
	private static String pwd = "root";
	
	public static Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url, login, pwd);
		}catch(ClassNotFoundException| SQLException e){
			e.printStackTrace();
		}
		
		return connect;
		
	}
	
	public static void closeConnection(){
		try {
			connect.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
