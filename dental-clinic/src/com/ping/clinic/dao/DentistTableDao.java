package com.ping.clinic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ping.clinic.pojo.Dentist;

public class DentistTableDao {

	public List<Dentist> findAll() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic_db", "ping58972", "58972");
			PreparedStatement statement = connection.prepareStatement("select * from dentist");
			ResultSet resultSet = statement.executeQuery();
			List<Dentist> dentistlist = new ArrayList<Dentist>();
			
			while(resultSet.next()) {
				Dentist dentist = new Dentist(resultSet.getInt("id"),
						resultSet.getString("full_name"), 
						resultSet.getString("email"), 
						resultSet.getInt("experience_year"), 
						resultSet.getString("address"), 
						resultSet.getString("phone_no"), 
						resultSet.getString("type_dentist")
						);
				dentistlist.add(dentist);
			}
			return dentistlist;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
