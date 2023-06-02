package com.xworkz.isckon.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.isckon.dto.IsckonDTO;
import com.xworkz.isckon.util.JdbcUtil;

public class IsckonRepoImp implements IsckonRepository {

	private Collection<IsckonDTO> isckon = new ArrayList<IsckonDTO>();

	@Override
	public boolean save(IsckonDTO dto) {
	//	Statement statement = null;
		int count = 0;
		if (dto != null) {
			try (Connection connection = DriverManager.getConnection(JdbcUtil.url,JdbcUtil.userName,JdbcUtil.password)) {

				String query = "insert into studentDetails values(?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(query);

				System.out.println("query:" + query);
				statement.setString(1, dto.getGodName());
				statement.setString(2, dto.getLocation());
				statement.setDouble(3, dto.getArea());
				statement.setFloat(4, dto.getEntryFee());
				statement.setBoolean(5, dto.isOpen());
				count = statement.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (count != 0) {
			return true;
		}
		return false;
	}
	@Override
	public boolean findByGodName(String godName) {
		int count = 0;
		if (godName != null) {
			try (Connection connection = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName,
					JdbcUtil.password)) {
				String query = "select * from isckon where godName='?'";

				PreparedStatement statement = connection.prepareStatement(query);
				statement.setString(1, godName);
				
				System.out.println(query);

				ResultSet resultset = statement.executeQuery(query);

				while (resultset.next()) {
					System.out.println(resultset.getString(1));		
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (count != 0) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean update(String godName) {
		int count = 0;
		if (godName != null) {
			try (Connection connection = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName,
					JdbcUtil.password)) {
				String query = "update isckon set godName='?' where godName='?'";

				PreparedStatement statement = connection.prepareStatement(query);
				statement.setString(1, godName);
				
				System.out.println(query);

				int resultset = statement.executeUpdate(query);
				System.out.println(resultset);

			} catch (Exception e) {
				e.printStackTrace();
			}
			if (count != 0) {
				return true;
			}
		}
		return false;
	}
}
