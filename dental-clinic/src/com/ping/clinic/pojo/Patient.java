package com.ping.clinic.pojo;

public class Patient {
	private int id;
	private String fullName;
	private String email;
	private int age;
	private String address;
	private String phoneNumber;
	private String script;
	public Patient(int id, String fullName, String email, int age, String address, String phoneNumber, String script) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.script = script;
	}
	public Patient() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getScript() {
		return script;
	}
	public void setScript(String script) {
		this.script = script;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", fullName=" + fullName + ", email=" + email + ", age=" + age + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", script=" + script + "]";
	}
	
}
