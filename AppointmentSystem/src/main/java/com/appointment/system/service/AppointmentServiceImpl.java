package com.appointment.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.appointment.system.dao.AppointmentDao;
import com.appointment.system.model.AppointmentEntity;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	AppointmentDao appointmentDao;
	
	public AppointmentServiceImpl() { }
	
	@Override
	public List<AppointmentEntity> getAppointments(){
		return appointmentDao.getAppointments();
	}

	@Override
	public boolean addAppointment(AppointmentEntity appoint) {
		return appointmentDao.insertAppointment(appoint) > 0 ;
	}

	@Override
	public AppointmentEntity getAppointmentById(int appointmentId) {
		return appointmentDao.getAppointmentById(appointmentId);
	}

	@Override
	public boolean deleteAppointment(int appointmentId) {
		return appointmentDao.deleteAppointment(appointmentId);
	}

	@Override
	public boolean updateAppointment(AppointmentEntity appoint) {
		return appointmentDao.updateAppointment(appoint);
	}
}