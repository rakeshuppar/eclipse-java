package com.xworkz.connection.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LaptopDetails {

	public static void main(String[] args) {

		try {

			System.out.println("driver is loaded successfully-------");
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("getting connection from the driver manager");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/profile", "root", "2lb16cv033");

			System.out.println("creating query");
			String query = "select * from laptop";

			System.out.println("creating statement");
			Statement statement = connection.createStatement();

			System.out.println("executing query");
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {
				System.out.println("id:" + result.getInt(1) + " " + " brand :" + result.getString(2) + " " + " cost:"
						+ result.getDouble(3) + " " + " color:" + result.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
