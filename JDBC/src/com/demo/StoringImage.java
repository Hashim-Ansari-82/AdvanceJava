package com.demo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoringImage {
      public static void main(String[] args)throws Exception {
		
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 String url="jdbc:mysql://localhost:3306/jdbc_db";
    	 String pass="root";
    	 String username="root";
    	 
    	 Connection con = DriverManager.getConnection(url,pass,username);
    	  String query="insert into img values(?,?)";
    	  PreparedStatement ps = con.prepareStatement(query);
    	  ps.setString(1,"Hashim Ansari");
    	  FileInputStream fos=new FileInputStream("com/mypic.png");
    	  ps.setBinaryStream(2, fos,fos.available());
    	  int i = ps.executeUpdate();
    	  if(i>0) {
    		  System.out.println("Storing successfully");
    	  }
    	  else {
    		  System.out.println("Storing Failed");
    	  }
	}
}
