package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Datebase Name");
		String dbname=sc.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/";
		String username="root";	
		String pass="root";
		String query="create database "+dbname;
		
		Connection con = DriverManager.getConnection(url,pass,username);
		PreparedStatement statement = con.prepareStatement(query);
		int i = statement.executeUpdate();
		if(i>0) {
		System.out.println("Created Database "+dbname+" successfully");
		}
		else {
			System.out.println("Database Created Failed");
		}
		sc.close();
	}
}
