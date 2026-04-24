package com.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	
		    public static void main(String[] args) {
               try {
            	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            	   System.out.println("Enter Your Name");
            	   String name=br.readLine();
            	   System.out.println("Enter Your City");
                  String city=br.readLine();
            	   Class.forName("com.mysql.cj.jdbc.Driver");
		    	String url="jdbc:mysql://localhost:3306/jdbc_db";
		    	String pass="root";
		    	String userName="root";
		    	 
		    	Connection con=DriverManager.getConnection(url,pass,userName);
		    	
		    	String query="insert into hr(name,city) values(?,?)";
		    	  
		    	PreparedStatement st = con.prepareStatement(query);
		    	
		    	st.setString(1,name);
		    	st.setString(2,city);
		    	
		    	int i = st.executeUpdate();
		    	if(i>0) {
		    		System.out.println("Insert Successfully");
		    	}
		    	else {
		    		System.out.println("Insert Failed");
		    	}
               }
               catch(Exception e) {
            	   e.printStackTrace();
               }
			}
}
