package com.ping.clinic.service;

import java.util.List;

import com.ping.clinic.dao.DentistTableDao;
import com.ping.clinic.pojo.Dentist;

public class DentistTableService {
	private DentistTableDao dentistTableDao = new DentistTableDao();
	
	public List<Dentist> getDentistTable(){
		return dentistTableDao.findAll();
	}
}
