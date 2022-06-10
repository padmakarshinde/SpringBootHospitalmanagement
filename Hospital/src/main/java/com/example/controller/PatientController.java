package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Patient;
import com.example.service.PatientService;


@RestController
@CrossOrigin("*")
public class PatientController {
	@Autowired
	private PatientService patientservice;
	
	@PostMapping("/registerPatient")
	public Patient registerPatient(@RequestBody Patient patient) {
		return patientservice.registerPatient(patient);
	} 
	
	@GetMapping("/getPatient")
	public List<Patient> getPatients(){
		return patientservice.getPatients();
		
	}
	
	@DeleteMapping("/deletePatient")
	public void deletePatient(@RequestParam Integer id) {
		
		patientservice.deletePatient(id);
	}
	
	@PutMapping("/updatePatient")
	public Patient updatePatient(@RequestBody Patient patient) {
		
		return patientservice.updatePatient(patient);
		
	}
	
}
	
	
	
	

