package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Appointment;
import com.example.repo.AppointmentRepo;

@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentRepo  repo;

	public Appointment registerAppointment(Appointment appointment) {
		return repo.save(appointment);
	}

	public List<Appointment> getAppointment() {
		return(List<Appointment>) repo.findAll();
	}

}
