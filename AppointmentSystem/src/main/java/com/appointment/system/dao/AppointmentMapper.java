package com.appointment.system.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.appointment.system.model.AppointmentEntity;

public class AppointmentMapper implements RowMapper<AppointmentEntity> {
	@Override
	public AppointmentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new AppointmentEntity(rs.getInt("id"), rs.getString("appDate"),
				rs.getString("appTime"), rs.getInt("ssn"));
	}
}