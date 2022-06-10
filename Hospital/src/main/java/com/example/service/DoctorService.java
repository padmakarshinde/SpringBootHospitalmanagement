package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Doctor;
import com.example.repo.DoctorRepo;




@Service
public class DoctorService {

	@Autowired
	private DoctorRepo repo;

	public Doctor registerDoctor(Doctor doctor) {
		return repo.save(doctor);
		
	}

	public List<Doctor> getDoctors() {
		return (List<Doctor>) repo.findAll();
	}
	
}
