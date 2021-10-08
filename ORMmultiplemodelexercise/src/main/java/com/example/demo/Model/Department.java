package com.example.demo.Model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private String departmentId;
	private String name;
	private double budget;
	private String startdate;
	
	@OneToMany(mappedBy = "department")
	private List<Course> courses;
	
	@ManyToOne
	@JoinColumn(name="instructor_id",referencedColumnName = "id")
	private Instructor instructor;
	
	public Department() {
		
	}

	public Department(String departmentId, String name, double budget, String startdate, List<Course> courses,
			Instructor instructor) {
		super();
		this.departmentId = departmentId;
		this.name = name;
		this.budget = budget;
		this.startdate = startdate;
		this.courses = courses;
		this.instructor = instructor;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
	
	
	
}
