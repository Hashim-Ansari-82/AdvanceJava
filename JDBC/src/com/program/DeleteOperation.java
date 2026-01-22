package com.program;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteOperation {
      public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("<----------- Enter Name --------------->");
		String name=br.readLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc_db",pass="root",username="root";
	
		Connection con = DriverManager.getConnection(url,username,pass);
		PreparedStatement ps = con.prepareStatement("delete from db where name=?");
         ps.setString(1,name);
         int executeUpdate = ps.executeUpdate();
         
		if(executeUpdate>0) {
			System.out.println("Delete Successfully");
		}
		else
			System.out.println("Delete Fail");
	}
}
