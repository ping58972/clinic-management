package com.ping.clinic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ping.clinic.pojo.ScheduleDentist;

public class ScheduleDentistDao {
	public List<ScheduleDentist> findAll(){
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic_db", "ping58972", "58972");
			String query = "select  sd.work_date, sd.start_time, sd.end_time, group_concat( d.full_name separator ', ' ) as dentists " + 
					"from schedule_time as sd, dentist as d " + 
					" join schedule_dentist m where sd.id = m.schedule_id and d.id = m.dentist_id " + 
					" group by sd.work_date, sd.start_time, sd.end_time " + 
					" order by sd.work_date;";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			List<ScheduleDentist> list = new ArrayList<ScheduleDentist>();
			
			while(resultSet.next()) {
				ScheduleDentist scheduleDentist = new ScheduleDentist(
						resultSet.getDate("work_date"), 
						resultSet.getTime("start_time"), 
						resultSet.getTime("end_time"), 
						resultSet.getString("dentists") 
						);
				list.add(scheduleDentist);
			}
			return list;
			
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
