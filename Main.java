package net.viralpatel.java;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;



 public class Main { 
	
	private static String JDBC_CONNECTION_URL= "jdbc:mysql://localhost:3306/Labour";
	private static String user = "root";
	private static String password ="welcome123";
		
	public static void main(String[] args) {
		try {

			CSVLoader loader = new CSVLoader(getCon());
			loader.loadCSV("D:/employee1.csv", "EMPLOYEE_1", true);
			
			
		   
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected static Connection getCon() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(JDBC_CONNECTION_URL,user,password);
			System.out.println("Connection success...!");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
		
	}
 }
