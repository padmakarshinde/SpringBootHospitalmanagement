package com.example.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.model.Doctor;
import com.example.model.User;
import com.example.model.UserRole;


public interface UserService  {

	//creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);

    //delete user by id
    public void deleteUser(Long userId);

}
