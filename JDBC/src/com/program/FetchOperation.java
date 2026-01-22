package com.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchOperation {
	 public static void main(String[] args) throws SQLException {
			
		 String url="jdbc:mysql://localhost:3306/jdbc_db",pass="root",username="root";
		 
		 Connection con = DriverManager.getConnection(url,username,pass);
		 String fetch="SELECT * FROM DB";
		 PreparedStatement ps = con.prepareStatement(fetch);//?,?,?
		 
		 ResultSet rs = ps.executeQuery();
		 System.out.println("Id\tName\t\temail   \t\tGender \tcity\n");
		 while(rs.next()) {
			 int id=rs.getInt("id");
			 String name=rs.getString("name");
			 String email=rs.getString("email");
			 String gender=rs.getString("gender");
			 String city=rs.getString("city");
			 System.out.println(id+"\t"+name+"\t"+email+"\t"+gender+"\t"+city+"\n");
			
		 }
		 con.close();
	 }
}
