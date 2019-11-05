package com.ping.clinic.pojo;

import java.sql.Date;
import java.sql.Time;

public class Appointment {
	private int id;
	private String patient;
	private String dentist;
	private Date workDate;
	private Time startTime;
	public Appointment(int id, String patient, String dentist, Date workDate, Time startTime) {
		super();
		this.id = id;
		this.patient = patient;
		this.dentist = dentist;
		this.workDate = workDate;
		this.startTime = startTime;
	}
	public Appointment() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	public String getDentist() {
		return dentist;
	}
	public void setDentist(String dentist) {
		this.dentist = dentist;
	}
	public Date getWorkDate() {
		return workDate;
	}
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", patient=" + patient + ", dentist=" + dentist + ", workDate=" + workDate
				+ ", startTime=" + startTime + "]";
	}
	
}
