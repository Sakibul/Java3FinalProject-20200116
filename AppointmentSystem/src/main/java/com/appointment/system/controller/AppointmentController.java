package com.appointment.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.appointment.system.model.AppointmentEntity;
import com.appointment.system.service.AppointmentService;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {
	@Autowired
	AppointmentService service;

	// http://localhost:8080/AppointmentSystem/appointments/getappointments
	@RequestMapping(value = "/getappointments", method = RequestMethod.GET)
	public ModelAndView getAppointmentsList() {
		ModelAndView modelView = new ModelAndView("appointment-list");

		List<AppointmentEntity> appointments = service.getAppointments();
		modelView.addObject("appointList", appointments);
		modelView.addObject("appointment", new AppointmentEntity());

		return modelView;
	}

	// http://localhost:8080/AppointmentSystem/appointments/addappointment
	@RequestMapping(value = "addappointment")
	public ModelAndView addAppointment() {
		ModelAndView mv = new ModelAndView("add-appointment");
		mv.addObject("appointment", new AppointmentEntity());
		return mv;
	}
	
	@RequestMapping(value = "saveAppointment", method = RequestMethod.POST)
	public String saveAppointment(@ModelAttribute("appointment") AppointmentEntity appoint) {
		if (service.addAppointment(appoint))
			return "redirect:/appointments/getappointments";
		else {
			return "ErrorPage";
		}
	}

	// http://localhost:8080/AppointmentSystem/appointments/deleteappointment
	@RequestMapping(value = "deleteappointment")
	public String deleteAppointment(@RequestParam("appointmentId") int appointmentId) {
		if (service.deleteAppointment(appointmentId)) {
			return "redirect:/appointments/getappointments";
		}
		else {
			return "ErrorPage";
		}
	}

	// http://localhost:8080/AppointmentSystem/appointments/editappointment
	@RequestMapping(value = "editappointment")
	public ModelAndView editAppointment(@RequestParam("appointmentId") int appointmentId) {
		ModelAndView mv = new ModelAndView("update-appointment");
		AppointmentEntity fetchedAppointment = service.getAppointmentById(appointmentId);
		mv.addObject("editedappointment", fetchedAppointment);
		return mv;
	}

	// http://localhost:8080/AppointmentSystem/appointments/updateAppointment
	@RequestMapping(value = "updateAppointment")
	public String updateAppointment(@ModelAttribute("appointment") AppointmentEntity appoint) {
		if (service.updateAppointment(appoint)) {
			return "redirect:/appointments/getappointments";
		} else {
			return "ErrorPage";
		}
	}
}