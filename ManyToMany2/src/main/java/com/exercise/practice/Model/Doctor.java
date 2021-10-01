package com.exercise.practice.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Doctor {
	@Id
	private String docid;
	private String name;
	private String specialisttype;
	
	@ManyToMany
	@JoinTable(name="doctor_patient",joinColumns = {@JoinColumn(name="doc_id",referencedColumnName ="docid" )},inverseJoinColumns = {@JoinColumn(name="patien_id",referencedColumnName = "patientId")})
	private List<Patient>patients=new ArrayList<Patient>();
	
	public Doctor() {
		
	}
	
	public Doctor(String docid, String name, String specialisttype,List<Patient>patients) {
		super();
		this.docid = docid;
		this.name = name;
		this.specialisttype = specialisttype;
		this.patients=patients;
	}
	public String getDocid() {
		return docid;
	}
	public void setDocid(String docid) {
		this.docid = docid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialisttype() {
		return specialisttype;
	}
	public void setSpecialisttype(String specialisttype) {
		this.specialisttype = specialisttype;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	
}
