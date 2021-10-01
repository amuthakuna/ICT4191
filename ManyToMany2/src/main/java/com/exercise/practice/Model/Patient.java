package com.exercise.practice.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {
	@Id
	private String patientId;
	private String name;
	private String age;
	
	@ManyToMany(mappedBy = "patients")
	private List<Doctor>doctors=new ArrayList<Doctor>();
	
	public Patient() {
		
	}
	
	public Patient(String patientId, String name, String age,List<Doctor>doctors) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.doctors=doctors;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	
	
}
