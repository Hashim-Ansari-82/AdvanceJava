package com.jdbc.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jdbc.connection.Helper;

public class UpdateStudent {

	public static void updateStudent(int id, String newEmail) {
		String query = "update students set name=? where id=?";
		try {
			Connection con = Helper.getConnection();
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, newEmail);
			statement.setInt(2, id);

			int row = statement.executeUpdate();
			System.out.println(row + " Update Student Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
