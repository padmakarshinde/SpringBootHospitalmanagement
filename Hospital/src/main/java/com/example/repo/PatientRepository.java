package com.example.repo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Patient;


@Repository
@CrossOrigin(allowedHeaders = "*", origins = "*")
public interface PatientRepository extends CrudRepository<Patient,Integer>{

	


	Patient findAllById(Integer id);

	 


	
}

