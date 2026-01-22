package com.program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
    public static void main(String[] args) throws Exception{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("		Enter id ");
    	int id = Integer.parseInt(br.readLine());
    	System.out.println("        Enter Name");
    	String name=br.readLine();
    	System.out.println("	    email");
    	String email=br.readLine();
    	System.out.println(" 	    Enter gender");
    	String gender=br.readLine();
    	System.out.println("	    Enter city");
    	String city=br.readLine();
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	String username="root";
    	String pass="root";
    	String url="jdbc:mysql://localhost:3306/jdbc_db";
        Connection con = DriverManager.getConnection(url,username,pass);
        PreparedStatement statement = con.prepareStatement
        ("insert into db values(?,?,?,?,?)");
        statement.setInt(1,id);
        statement.setString(2,name);
        statement.setString(3,email);
        statement.setString(4,gender);
        statement.setString(5,city);
        int executeUpdate = statement.executeUpdate(); 
         if(executeUpdate>0) {
        System.out.println("Update successfully");
         }
         else {
        	 System.out.println("Update failed");
         }
         
        con.close();
    }
}
