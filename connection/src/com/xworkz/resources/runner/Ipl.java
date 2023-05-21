package com.xworkz.resources.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.xworkz.resources.util.validationUtil;

public class Ipl {

	public static void main(String[] args) throws SQLException {

		Statement statement = null;

		System.out.println("-----------------------START--------------------------------");

		System.out.println("-----------------------INERT----------------------------");

		try (Connection connection = DriverManager.getConnection(validationUtil.jdbcurl, validationUtil.username,
				validationUtil.password)) {

			String query = "insert into iplTeam  Values(10,'GT','Hardik Pandya','Ashish Nehra','CVC Capital Partners',1,2021,'Narendra Modi Stadium','Ahmedabad','Gujarat');";
			statement = connection.createStatement();
			int i = statement.executeUpdate(query);
			if (i != 0) {
				System.out.println("Insert Successfully");
			} else {
				System.err.println("Insert Unsuccessfully");
			}
			System.out.println(query);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
		}

		System.out.println("---------------------UPDATE---------------------------");

		try (Connection connection = DriverManager.getConnection(validationUtil.jdbcurl, validationUtil.username,
				validationUtil.password)) {

			String query1 = "update iplTeam set name='Lahore Qalandars',captain='Shaheen Afridi', coach='Aaqib Javed',owner='Fawad Rana',champions=2,founded=2015,homeGround='Gaddafi Stadium',city='Lahore',state='Punjab' where id= 10";
			statement = connection.createStatement();
			int i1 = statement.executeUpdate(query1);
			if (i1 != 0) {
				System.out.println("Update Successfully");
			} else {
				System.err.println("Update Unsuccessfully");
			}
			System.out.println("number of updates:" + i1 + "  " + query1);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
		}

		System.out.println("------------------------DELETE--------------------------");

		try (Connection connection = DriverManager.getConnection(validationUtil.jdbcurl, validationUtil.username,
				validationUtil.password)) {
			String query = "delete from iplTeam where id=10";
			Statement statement1 = connection.createStatement();
			int i = statement1.executeUpdate(query);
			if (i != 0) {
				System.out.println("Delete Succeccfully");
			} else {
				System.err.println("Delete Unsuccessfully");
			}
			System.out.println("number of delete:" + i + " " + query);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
		}
		System.out.println("------------------------------END------------------------");
	}

}
