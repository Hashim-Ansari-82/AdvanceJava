package com.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CreateDatabase {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/";
		String pass = "root";
		String username="root";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("<----------- Enter Database Name --------->");
		String dbname=sc.next();
		String query="Create database "+dbname;
		
	//s	Class.forName("com.mysql.jdbc.cj.Driver");
		
		Connection con = DriverManager.getConnection(url,pass,username);
		PreparedStatement statement = con.prepareStatement(query);
		statement.executeUpdate();
		con.close();
		System.out.println("create database Successfully");
		sc.close();
	}
}
