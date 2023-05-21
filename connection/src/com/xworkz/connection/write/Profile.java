package com.xworkz.connection.write;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Profile {

	public static void main(String[] args) {

		try {
			System.out.println("driver is loaded successfully-------");
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("getting connection from the driver manager");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/profile", "root",
					"2lb16cv033");

			System.out.println("creating query");
			String query = "insert into new_table value(5,'Ravana',26,'Male')";
			System.out.println(query);

			System.out.println("creating statement");
			Statement statement = connection.createStatement();

			boolean exist = statement.execute(query);
			System.out.println(exist);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
