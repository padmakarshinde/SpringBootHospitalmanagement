package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Appointment;
import com.example.model.Doctor;
import com.example.service.AppointmentService;

@RestController
@CrossOrigin(origins ="*")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("/createAppointment")
	public Appointment registerAppointment(@RequestBody Appointment appointment) {
		return appointmentService.registerAppointment(appointment);
	} 

	@GetMapping("/getAppointment")
	public List<Appointment> getAppointment(){
		return appointmentService.getAppointment();
		
	}
}
