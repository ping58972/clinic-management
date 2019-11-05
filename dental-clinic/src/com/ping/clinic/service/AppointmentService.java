package com.ping.clinic.service;

import java.util.List;

import com.ping.clinic.dao.AppointmentDao;
import com.ping.clinic.pojo.Appointment;

public class AppointmentService {
	private AppointmentDao appointmentDao = new AppointmentDao();
	
	public List<Appointment> getAppointmentsTable(){
		return appointmentDao.findAll();
	}
}
