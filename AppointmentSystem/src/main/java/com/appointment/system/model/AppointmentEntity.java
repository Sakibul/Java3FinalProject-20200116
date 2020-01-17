package com.appointment.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")
public class AppointmentEntity {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "appDate", nullable = false, unique = false)
	private String appDate;
	
	@Column(name = "appTime", nullable = false, unique = false)
	private String appTime;
	
	@Column(name = "ssn")
	private int ssn;
	
	public AppointmentEntity() {}
	
	public AppointmentEntity(int id, String appDate, String appTime, int ssn) {
		this.id = id;
		this.appDate = appDate;
		this.appTime = appTime;
		this.ssn = ssn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppDate() {
		return appDate;
	}

	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public String getAppTime() {
		return appTime;
	}

	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
}