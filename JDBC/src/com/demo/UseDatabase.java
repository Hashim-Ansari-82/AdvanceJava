package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UseDatabase {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Datebase Name");
		String dbname=sc.nextLine();
		String url="jdbc:mysql://localhost:3306/";
        String pass="root";
        String username="root";
        String query="use "+dbname;
        
        Connection con = DriverManager.getConnection(url,pass,username);
        PreparedStatement statement = con.prepareStatement(query);
        statement.executeUpdate();
        System.out.println("Database uses Successfully");
        sc.close();
	}
}
