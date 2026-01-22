package com.program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.Scanner;

public class JDBCCrudOperation {

	private static String url = "jdbc:mysql://localhost:3306/", pass = "root", username = "root";
	private static String url1 = "jdbc:mysql://localhost:3306/Department";
	private static String tableName="Detail",dbname="Department";

             	/* Create Database */

	public static void createDatabase() throws SQLException {
		String createDB = "CREATE DATABASE "+dbname;
		Connection con = DriverManager.getConnection(url, username, pass);
		PreparedStatement ps = con.prepareStatement(createDB);
		int executeUpdate = ps.executeUpdate();

		if (executeUpdate > 0) {
			System.out.println("\n<----------- Created database Successfullly -------->");
		} else {
			System.out.println("\n<---------- Created Database Failed --------------->");
		}
		con.close();
	}
	public static void createTable() throws SQLException {
		String tablename = "create table "+tableName+"(Rollno int Primary key,name varchar(50),C Varchar(50),Cplus varchar(50),Java Varchar(50),DBMS varchar(50))";
	Connection con = DriverManager.getConnection(url1, username, pass);
		PreparedStatement ps = con.prepareStatement(tablename);
		int executeUpdate = ps.executeUpdate();
		if (executeUpdate == 0) {
			System.out.println("\n<--------------- Created table successfully ------------------->");
		} else {
			System.out.println("\n<--------------- Table Created Failed ------------------------->");
		}
}                  /* Insert Values */

	public static void insertValue() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("<----------- Enter Roll no ------->");
		int rollno = Integer.parseInt(br.readLine());
		System.out.println("<------------ Enter Name --------->");
		String name = br.readLine();
		System.out.println("<----------- Enter Marks C -------->");
		String C = br.readLine();
		System.out.println("<--------- Enter Marks C++  -------->");
		String C1 = br.readLine();
		System.out.println("<--------- Enter Marks java --------->");
		String Java = br.readLine();
		System.out.println("<---------- Enter Marks DBMS ---------->");
		String DBMS = br.readLine();
		String insertValues = "Insert into "+tableName+" values(?,?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url1, username, pass);
		PreparedStatement ps = con.prepareStatement(insertValues);
		ps.setInt(1, rollno);
		ps.setString(2, name);
		ps.setString(3, C);
		ps.setString(4, C1);
		ps.setString(5, Java);
		ps.setString(6, DBMS);
		int executeUpdate = ps.executeUpdate();
		if (executeUpdate > 0) {
			System.out.println("\n<---------------- Insert Values Successfull ------------->");
		} else {
			System.out.println("<----------------- Insert Values Failed ------------------->");
		}
	}

	public static void updateValues() throws SQLException {
		String updateValue = "update "+tableName+" set C =? where name=?";
		Scanner sc = new Scanner(System.in);
		System.err.println("<--------------- Enter name ------------>");
		String name = sc.nextLine();
		System.err.println("<--------------- Enter marks C ------------>");
		String C = sc.nextLine();
		Connection con = DriverManager.getConnection(url1, username, pass);
		PreparedStatement ps = con.prepareStatement(updateValue); 
		ps.setString(1,C); 
		ps.setString(2,name);
		int executeUpdate = ps.executeUpdate();
		if (executeUpdate > 0) {
			System.out.println("\n<------------ Update Values Successfully ----------->");
		} else {
			System.out.println("\n<------------ Update Values Failed ----------------->");
		}
	}

	public static void deleteValues() throws SQLException {
		String deleteValue = "delete from "+tableName+" where name=?";
		Scanner sc = new Scanner(System.in);
		System.err.println("<--------------- Enter Name ------------>");
		String name = sc.nextLine();
		Connection con = DriverManager.getConnection(url1, username, pass);
		PreparedStatement ps = con.prepareStatement(deleteValue);
		ps.setString(1, name);
		int executeUpdate = ps.executeUpdate();
		if (executeUpdate > 0) {
			System.out.println("\n<------------ Deleted Values Successfully ------------->");
		} else {
			System.out.println("\n<------------ Deleted Values Failed ------------------->");
		}
	}

	public static void fetchTable() throws SQLException {
		String fetchTable = "Select * from "+tableName;
		Connection con = DriverManager.getConnection(url1, username, pass);
		PreparedStatement ps = con.prepareStatement(fetchTable);
		ResultSet rs = ps.executeQuery();
		if (!rs.isBeforeFirst()) {
			System.out.println("<---------- Your Table is empty ------------>");
		} else {
			System.out.println("Roll_no   Name  \tC\tC++\tJava   DBMS\n");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\n");
			}
		}
	}

	public static void main(String[] args) throws Exception {

		 Scanner sc = new Scanner(System.in);  
		int choice = 0;
		do {
			System.out.println("\n<---------------------- Choose any option ------------------>\n");
			System.out  
					.println("\n1. Create Database  \t2. Create Table \t3. Insert Values \n\n"
							+ "4. Update Values  \t5. Delete Values  \t6. Fetch Tablel\n");
			System.out.println("                        7.Exit Button");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				createDatabase();
				break;
			case 2:
				createTable();
				break;
			case 3:
				insertValue();
				break;
			case 4:
				updateValues();
				break;
			case 5:
				deleteValues();
				break;
			case 6:
				fetchTable();
				break;
			}
		} while (choice !=7);
		System.out.println("<-------------Transaction Successfully ------------->");
		sc.close();
		
	}
}
