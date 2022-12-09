package oraclejdbc.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Load the Driver
		//static method - forName
		//Class - pre defined class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Generate the connection
		//getConnection - static method
		//DriverManager - pre defined class
		Connection connection = DriverManager.getConnection("jdbc:oracl:thin:@localhost:1521:xe", "HR", "Deepikajk@123");
		
		//Write a Query
		String s="Select * from Employees";
		//Convert the Query  into a Statement
		PreparedStatement prepareStatement = connection.prepareStatement(s);
		//Execute the Query
		ResultSet executeQuery = prepareStatement.executeQuery();
		//Iterate the table to print
		while(executeQuery.next()) {
			String string = executeQuery.getString("First_name");
			System.out.println(string);
		}
		connection.close();
		
		
		
		
		
	}

}
