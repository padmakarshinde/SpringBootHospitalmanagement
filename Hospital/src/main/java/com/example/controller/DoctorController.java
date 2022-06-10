package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Doctor;

import com.example.service.DoctorService;


@RestController
@CrossOrigin(origins ="*")
public class DoctorController {
	@Autowired
	private DoctorService doctorservice;
	
	@PostMapping("/registerDoctor")
	public Doctor registerDoctor(@RequestBody Doctor doctor) {
		return doctorservice.registerDoctor(doctor);
	} 
	
	@GetMapping("/getDoctor")
	public List<Doctor> getDoctors(){
		return doctorservice.getDoctors();
		
	}

}
