package com.ping.clinic.pojo;

public class Dentist {

	private int id;
	private String fullName;
	private String email;
	private int experienceYear;
	private String address;
	private String phoneNo;
	private String typeDentist;

	public Dentist() {
		super();
	}

	public Dentist(int id, String fullName, String email, int experienceYear, String address, String phoneNo, String typeDentist) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.experienceYear = experienceYear;
		this.address = address;
		this.phoneNo = phoneNo;
		this.typeDentist = typeDentist;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getExperienceYear() {
		return experienceYear;
	}

	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getTypeDentist() {
		return typeDentist;
	}

	public void setTypeDentist(String typeDentist) {
		this.typeDentist = typeDentist;
	}

	@Override
	public String toString() {
		return "Dentist [id=" + id + "email="+email +", fullName=" + fullName + ", experienceYear=" + experienceYear + ", address="
				+ address + ", phoneNo=" + phoneNo + ", typeDentist=" + typeDentist + "]";
	}

}
