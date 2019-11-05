package com.ping.clinic.service;

import java.util.List;

import com.ping.clinic.dao.PatientDao;
import com.ping.clinic.pojo.Patient;

public class PatientService {
	private PatientDao patientDao = new PatientDao();
	public List<Patient> getPatients(){
		return patientDao.findAll();
	}
}
