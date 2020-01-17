package com.appointment.system.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appointment.system.model.AppointmentEntity;

@Repository
public class HibernateAppointmentDaoImpl implements AppointmentDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public int insertAppointment(AppointmentEntity appoint) {
		sessionFactory.getCurrentSession().save(appoint);
		return 1;
	}

	@Override
	public List<AppointmentEntity> getAppointments() {
		//Appointment is not the table name => it is the class name(@Entity)
		return getSession().createQuery("from AppointmentEntity", AppointmentEntity.class).list();
	}

	@Override
	public AppointmentEntity getAppointmentById(int appointmentId) {
		return (AppointmentEntity) getSession().get(AppointmentEntity.class, appointmentId);
	}

	@Override
	public boolean deleteAppointment(int appointmentId) {
		AppointmentEntity fetchedAppointment = getAppointmentById(appointmentId);
		getSession().delete(fetchedAppointment);
		return true;
	}

	@Override
	public boolean updateAppointment(AppointmentEntity appoint) {
		getSession().update(appoint);
		return true;
	}
}