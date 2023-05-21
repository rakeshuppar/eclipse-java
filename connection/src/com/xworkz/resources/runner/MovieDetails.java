package com.xworkz.resources.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.resources.util.validationUtil;

public class MovieDetails {

	public static void main(String[] args) throws SQLException {

		Statement statement = null;

		System.out.println("---------------------------START------------------------------------");

		System.out.println("---------------------------INSERT-----------------------------------");

		try (Connection connection = DriverManager.getConnection(validationUtil.jdbcurl, validationUtil.username,
				validationUtil.password)) {

			String query = "insert into movie values(5,'Totapuri','Jaggesh','Aditi',3,40000);";
			statement = connection.prepareStatement(query);
			int i = statement.executeUpdate(query);
			if (i != 0) {
				System.out.println("insert successfully");
			} else {
				System.err.println("insert unsuccesfully");
			}
			System.out.println(query);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
		}

		System.out.println("--------------------------------UPDATE----------------------------------");
		try (Connection connection = DriverManager.getConnection(validationUtil.jdbcurl, validationUtil.username,
				validationUtil.password)) {

			String query1 = "update movie set name='Ram',hero='PuneethRajKumar',heroine='Priyamani',numSongs=6,budget=50000 where id=3 ";

			statement = connection.prepareStatement(query1);
			int i1 = statement.executeUpdate(query1);
			if (i1 != 0) {
				System.out.println("update successfully");
			} else {
				System.err.println("update unsuccessfully");
			}
			System.out.println("number of updates:" + i1 + " " + query1);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
		}

		System.out.println("---------------------------------DELETE--------------------------");

		try (Connection connection = DriverManager.getConnection(validationUtil.jdbcurl, validationUtil.username,
				validationUtil.password)) {

			String query2 = "delete from movie where id=5";

			statement = connection.prepareStatement(query2);
			int i2 = statement.executeUpdate(query2);
			if (i2 != 0) {
				System.out.println("delete successfully");
			} else {
				System.err.println("delete unsuccessfully");
			}
			System.out.println("number of delete: " + i2 + " " + query2);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
		}
		System.out.println("------------------------------END-------------------------------");

	}
}
