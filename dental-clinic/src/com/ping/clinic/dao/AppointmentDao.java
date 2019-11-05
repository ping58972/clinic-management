package com.ping.clinic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ping.clinic.pojo.Appointment;

public class AppointmentDao {
	public List<Appointment> findAll(){
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic_db", "ping58972", "58972");
			String query = " select a.id, p.full_name as patient, d.full_name as dentist, st.work_date, st.start_time from appointment a " + 
					"  join patient p on a.patient_id = p.id " + 
					"  join schedule_dentist sd on a.schedule_d_id = sd.id " + 
					"  join dentist d on sd.dentist_id = d.id " + 
					"  join schedule_time st on st.id = sd.schedule_id;";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			List<Appointment> appointmentList = new ArrayList<Appointment>();
			
			while(resultSet.next()) {
				Appointment appointment = new Appointment(resultSet.getInt("id"),
						resultSet.getString("patient"), 
						resultSet.getString("dentist"), 
						resultSet.getDate("work_date"), 
						resultSet.getTime("start_time") 
						);
				appointmentList.add(appointment);
			}
			return appointmentList;
			
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
