package com.jdbc.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jdbc.connection.Helper;

public class DeleteStudent {

	public static void deleteStudent(int id) {
		String qeury = "delete from Students where id=?";
		try {
			Connection con = Helper.getConnection();
			PreparedStatement st = con.prepareStatement(qeury);
			st.setInt(1, id);
			int row = st.executeUpdate();
			System.out.println(row+ " Student Deleted Successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
