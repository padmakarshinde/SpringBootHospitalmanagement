package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Appointment;

@Repository
@CrossOrigin(allowedHeaders = "*", origins = "*")
public interface AppointmentRepo extends CrudRepository<Appointment,Integer>{

}
