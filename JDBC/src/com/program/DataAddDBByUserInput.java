package com.program;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;

public class DataAddDBByUserInput {
    public static void main(String[] args) throws Exception {
		
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("<---------- Enter id -------->");  
        int id=Integer.parseInt(br.readLine());
        System.out.println("<---------- Enter Name ------>");
        String name=br.readLine();
        System.out.println("<---------- Enter email ------>");
        String email=br.readLine();
        System.out.println("<---------- Enter Gender ------>");
        String gender=br.readLine();
        System.out.println("<---------- Enter City ------>");
        String city=br.readLine();
        System.out.println("<--------- Data add Successfull ---------->");
    	
       Class.forName("com.mysql.cj.jdbc.Driver");
       String pass="root",username="root",url="jdbc:mysql://localhost:3306/jdbc_db";
       Connection con = DriverManager.getConnection(url,username,pass);
       PreparedStatement ps = con.prepareStatement("insert into db values(?,?,?,?,?)");
      
       ps.setInt(1, id);
       ps.setString(2, name);
       ps.setString(3, email);
       ps.setString(4, gender);
       ps.setString(5, city);
       ps.executeUpdate();
       br.close(); 
       con.close();
	}
}
