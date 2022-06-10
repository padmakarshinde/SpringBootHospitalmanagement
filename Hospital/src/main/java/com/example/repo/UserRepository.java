package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Doctor;
import com.example.model.User;

public interface UserRepository extends JpaRepository<User, Long> {


	public User findByUsername(String username);




}
