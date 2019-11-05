package com.ping.clinic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ping.clinic.pojo.Dentist;
import com.ping.clinic.pojo.User;

public class UserDao {
	public User getUserByUsernameAndPassword(String username, String password){
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic_db", "ping58972", "58972");
			PreparedStatement statement = connection.prepareStatement("select * from clinic_user where user_name = ? and pass_word = ?");
			statement.setString(1,  username);
			statement.setString(2,  password);
			ResultSet resultSet = statement.executeQuery();
			User user =null;
			while(resultSet.next()) {
				user = new User(resultSet.getInt("id"), resultSet.getString("user_name"), resultSet.getString("pass_word"));
			}
			return user;
		} catch (Exception e) {
			return null;
		}
		
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
