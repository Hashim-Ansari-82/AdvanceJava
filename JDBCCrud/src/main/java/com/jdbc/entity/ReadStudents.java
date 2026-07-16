package com.jdbc.entity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.connection.Helper;

public class ReadStudents {

	public static void getAllStudents() {
		
		String query="select * from students";
		
		try {
			Connection con = Helper.getConnection();
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" | "+ rs.getString("name")
                          +rs.getInt("age")	+" | "+ rs.getString("email"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
