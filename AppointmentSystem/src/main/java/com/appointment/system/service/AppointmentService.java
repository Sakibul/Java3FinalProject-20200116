package com.appointment.system.service;

import java.util.List;

import com.appointment.system.model.AppointmentEntity;

public interface AppointmentService {
	public boolean addAppointment(AppointmentEntity appoint);
	
	public List<AppointmentEntity> getAppointments(); // Read
	
	public AppointmentEntity getAppointmentById(int appointmentId); // Read
	
	public boolean deleteAppointment(int appointmentId); //DELETE
	
	public boolean updateAppointment(AppointmentEntity appoint); // UPDATE
}