package com.xworkz.connection.write;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LaptopDetails {

	public static void main(String[] args) {

		try {

			System.out.println("driver loaded successfully");
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("getting connection from DriverManger");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/profile", "root",
					"2lb16cv033");

			System.out.println("creating query");
			String query = "insert into laptop values(1,'HP',40000.0,'Black')";
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