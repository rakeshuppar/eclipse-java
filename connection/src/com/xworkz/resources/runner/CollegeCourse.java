package com.xworkz.resources.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.resources.util.validationUtil;

public class CollegeCourse {

	public static void main(String[] args) throws SQLException {

		Statement statement = null;

		System.out.println("---------------------------START------------------------------------");

		System.out.println("---------------------------INSERT-----------------------------------");

		try (Connection connection = DriverManager.getConnection(validationUtil.jdbcurl, validationUtil.username,
				validationUtil.password)) {

			String query = "insert into college values(10,'SharanaBasaveshwara','arts',2,30,30000);";
			statement = connection.prepareStatement(query);
			int i = statement.executeUpdate(query);
			if (i != 0) {
				System.out.println("insert succesfully");
			} else {
				System.err.println("insert unsuccesfully");
			}
			System.out.println(query);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
		}

		System.out.println("-----------------------------UPDATE---------------------------");

		try (Connection connection = DriverManager.getConnection(validationUtil.jdbcurl, validationUtil.username,
				validationUtil.password)) {

			String query3 = "update college set name='sarakari',course='arts',duration=2,lecturers=10,fee=900 where id=10";

			statement = connection.createStatement();
			int i3 = statement.executeUpdate(query3);
			if (i3 != 0) {
				System.out.println("update successfully");
			} else {
				System.err.println("update unsuccessfully");
			}
			System.out.println("number of updates:" + i3 + " " + query3);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
		}

		System.out.println("-----------------------------DELETE---------------------------------");

		try (Connection connetion = DriverManager.getConnection(validationUtil.jdbcurl, validationUtil.username,
				validationUtil.password)) {

			String query1 = "delete from college where id=10";
			statement = connetion.createStatement();

			int i1 = statement.executeUpdate(query1);
			if (i1 != 0) {
				System.out.println("delete succesfully");
			} else {
				System.err.println("delete unsuccesfully");

			}
			System.out.println("number of delete:" + i1 + " " + query1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
		}
		System.out.println("-----------------------------END---------------------------------");

	}

}
