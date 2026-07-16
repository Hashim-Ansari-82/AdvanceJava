package com.jdbc.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jdbc.connection.Helper;

public class CreateStudent {

	public static void insertStudent(String name,int age,String email) {
		
		String query="Insert into students(name,age,email) values(?,?,?)";
		try {
		Connection con = Helper.getConnection();
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,name);
		statement.setInt(2, age);
		statement.setString(3, email);
		
		int row = statement.executeUpdate();
		System.out.println(row+" Student Insert Successfully");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
