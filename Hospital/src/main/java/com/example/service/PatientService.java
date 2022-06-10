package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Patient;
import com.example.repo.PatientRepository;


@Service
public class PatientService {
	@Autowired
	private PatientRepository patientrepository;	
	
	public Patient registerPatient(Patient patient ) {
		
		return patientrepository.save(patient);
	}

	
	
public List<Patient> getPatients(){
	return (List<Patient>) patientrepository.findAll();
	
	
}
	
public void deletePatient(Integer id) {
	patientrepository.deleteById(id);  
	
}	

	public Patient updatePatient(Patient patient) {
		
		Integer id =patient.getId();
		
		Patient pati=patientrepository.findById(id).get();
		
		pati.setName(patient.getName());
		pati.setEmail(patient.getEmail());
		pati.setAddress(patient.getAddress());
		pati.setTreatement(patient.getTreatement());
		
		return patientrepository.save(pati);
		
	}



	public void deleteAppointment(Integer id) {
		patientrepository.deleteById(id);
		
	}

	
	
}
