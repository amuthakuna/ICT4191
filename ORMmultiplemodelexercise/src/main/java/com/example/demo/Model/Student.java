package com.example.demo.Model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private String id;
	private String lastname;
	private String firstmidname;
	private String entrollmentDate;
	
	@OneToMany(mappedBy = "student")
	private List<Enrollment> enrollments;
	
	public Student() {
		
	}

	public Student(String id, String lastname, String firstmidname, String entrollmentDate,
			List<Enrollment> enrollments) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstmidname = firstmidname;
		this.entrollmentDate = entrollmentDate;
		this.enrollments = enrollments;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstmidname() {
		return firstmidname;
	}

	public void setFirstmidname(String firstmidname) {
		this.firstmidname = firstmidname;
	}

	public String getEntrollmentDate() {
		return entrollmentDate;
	}

	public void setEntrollmentDate(String entrollmentDate) {
		this.entrollmentDate = entrollmentDate;
	}

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}
	
	
	
	
}
