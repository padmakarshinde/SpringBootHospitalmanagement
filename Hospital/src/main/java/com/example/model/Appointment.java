package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String phoneno;
	private String address;
	private String treatement;
	
	public Appointment() {}
	
	
	public Appointment(String email, String firstname, String lastname,
			 String gender, String phoneno, String address, String treatement) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.phoneno = phoneno;
		this.address = address;
		this.treatement = treatement;
	}
	
	
	public Appointment(int id, String firstname, String lastname, String email, String gender, String phoneno,
			String address, String treatement) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.phoneno = phoneno;
		this.address = address;
		this.treatement = treatement;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTreatement() {
		return treatement;
	}
	public void setTreatement(String treatement) {
		this.treatement = treatement;
	}

	
	
}
