package com.ping.clinic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ping.clinic.pojo.Appointment;
import com.ping.clinic.pojo.Dentist;
import com.ping.clinic.pojo.Patient;

public class PatientDao {
	public List<Patient> findAll(){
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic_db", "ping58972", "58972");
			PreparedStatement statement = connection.prepareStatement("select * from patient");
			ResultSet resultSet = statement.executeQuery();
			List<Patient> patientList = new ArrayList<Patient>();
			
			while(resultSet.next()) {
				Patient patient = new Patient(resultSet.getInt("id"),
						resultSet.getString("full_name"), 
						resultSet.getString("email"), 
						resultSet.getInt("age"), 
						resultSet.getString("address"), 
						resultSet.getString("phone_no"), 
						resultSet.getString("script")
						);
				patientList.add(patient);
			}
			return patientList;
			
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
