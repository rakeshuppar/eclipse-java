package com.xworkz.connection.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SoftwareDetails {

	public static void main(String[] args) {

		try {
			System.out.println("driver is loaded successfully-------");
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("getting connection from the driver manager");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/profile", "root", "2lb16cv033");

			System.out.println("creating query");
			String query = "select * from software";

			System.out.println("creating statement");
			Statement st = connection.createStatement();

			System.out.println("executing query");
			ResultSet result = st.executeQuery(query);
			while (result.next()) {
				System.out.println("id:" + result.getInt(1) + " " + " name:" + result.getString(2) + " " + " lang:"
						+ result.getString(3) + " " + " version:" + result.getFloat(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
