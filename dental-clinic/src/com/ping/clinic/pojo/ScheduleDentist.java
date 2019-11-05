package com.ping.clinic.pojo;

import java.sql.Date;
import java.sql.Time;

public class ScheduleDentist {
	private Date workDate;
	private Time startTime;
	private Time endTime;
	private String dentists;
	public ScheduleDentist(Date workDate, Time startTime, Time endTime, String dentists) {
		super();
		this.workDate = workDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.dentists = dentists;
	}
	public ScheduleDentist() {
		super();
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
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public String getDentists() {
		return dentists;
	}
	public void setDentists(String dentists) {
		this.dentists = dentists;
	}
	@Override
	public String toString() {
		return "ScheduleDentist [workDate=" + workDate + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", dentists=" + dentists + "]";
	}
	
}
