package com.example.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.example.helper.UserFoundException;
import com.example.model.Doctor;
import com.example.model.User;
import com.example.model.UserRole;
import com.example.repo.RoleRepository;
import com.example.repo.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	  @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private RoleRepository roleRepository;

	    //creating user
	    @Override
	    public User createUser(User user, Set<UserRole> userRoles) throws Exception {


	        User local = this.userRepository.findByUsername(user.getUsername());
	        if (local != null) {
	            System.out.println("User is already there !!");
	            throw new UserFoundException();
	        } else {
	            //user create
	            for (UserRole ur : userRoles) {
	                roleRepository.save(ur.getRole());
	            }

	            user.getUserRoles().addAll(userRoles);
	            local = this.userRepository.save(user);

	        }

	        return local;
	    }

	    //getting user by username
	    @Override
	    public User getUser(String username) {
	        return this.userRepository.findByUsername(username);
	    }

	    @Override
	    public void deleteUser(Long userId) {
	        this.userRepository.deleteById(userId);
	    }

		

}
