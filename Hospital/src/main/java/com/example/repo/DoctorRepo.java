package com.example.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Doctor;



@Repository
@CrossOrigin(allowedHeaders = "*", origins = "*")
public interface DoctorRepo extends CrudRepository<Doctor,Integer>{

}
