package com.appointment.system.dao;

import java.util.List;

import com.appointment.system.model.AppointmentEntity;

public interface AppointmentDao {
	public int insertAppointment(AppointmentEntity appoint); //Create
	
	public List<AppointmentEntity> getAppointments(); // Read
	
	public AppointmentEntity getAppointmentById(int appointmentId); // Read
	
	public boolean deleteAppointment(int appointmentId); //DELETE
	
	public boolean updateAppointment(AppointmentEntity appoint); // UPDATE
}