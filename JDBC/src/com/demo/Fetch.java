package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fetch {
	
	public static void main(String[] args) throws Exception{
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 String url="jdbc:mysql://localhost:3306/jdbc_db";
		 String pass="root";
		 String userName="root";
		 
		 Connection con=DriverManager.getConnection(url,userName,pass);
		
		 String query="Select * from hr";
		 PreparedStatement st = con.prepareStatement(query);
		 ResultSet rs = st.executeQuery();
		 while(rs.next()) {
			 System.out.println(rs.getInt(1)+"			"+rs.getString(2)+"			"+rs.getString(3));
		 }
	}
}
