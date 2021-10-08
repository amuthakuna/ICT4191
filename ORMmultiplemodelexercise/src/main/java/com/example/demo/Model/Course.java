package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	private String courseid;
	private String title;
	private int credits;
	
	@OneToMany(mappedBy = "course")
	private List<Enrollment> entrollments;
	
	@ManyToOne
	@JoinColumn(name="department_id",referencedColumnName = "departmentId")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name="instructor_id",referencedColumnName = "id")
	private Instructor instructor;
	
	public Course() {
		
	}

	public Course(String courseid, String title, int credits, List<Enrollment> entrollments, Department department,
			Instructor instructor) {
		super();
		this.courseid = courseid;
		this.title = title;
		this.credits = credits;
		this.entrollments = entrollments;
		this.department = department;
		this.instructor = instructor;
	}

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public List<Enrollment> getEntrollments() {
		return entrollments;
	}

	public void setEntrollments(List<Enrollment> entrollments) {
		this.entrollments = entrollments;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
	
}
