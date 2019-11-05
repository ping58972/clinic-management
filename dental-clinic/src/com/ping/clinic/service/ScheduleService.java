package com.ping.clinic.service;

import java.util.List;

import com.ping.clinic.dao.ScheduleDentistDao;
import com.ping.clinic.pojo.ScheduleDentist;

public class ScheduleService {
	private ScheduleDentistDao scheduleDentistDao = new ScheduleDentistDao();
	public List<ScheduleDentist> getScheduleDentists(){
		return scheduleDentistDao.findAll();
	}
}
