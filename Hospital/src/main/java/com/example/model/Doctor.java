package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Doctor")
	public class Doctor {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int doctorid;
	    private String doctorname;
	    private String email;
	    private String phoneno;
	    private String address;
	    private String dob;
	    private String password;
	    private String specialist;
	    private String opdtime;
	    private String doctorfees;
	    
	    
		public int getDoctorid() {
			return doctorid;
		}
		public void setDoctorid(int doctorid) {
			this.doctorid = doctorid;
		}
		public String getDoctorname() {
			return doctorname;
		}
		public void setDoctorname(String doctorname) {
			this.doctorname = doctorname;
		}
		public String getSpecialist() {
			return specialist;
		}
		public void setSpecialist(String specialist) {
			this.specialist = specialist;
		}
		public String getOpdtime() {
			return opdtime;
		}
		public void setOpdtime(String opdtime) {
			this.opdtime = opdtime;
		}
		public String getDoctorfees() {
			return doctorfees;
		}
		public void setDoctorfees(String doctorfees) {
			this.doctorfees = doctorfees;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
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
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
	    
}

