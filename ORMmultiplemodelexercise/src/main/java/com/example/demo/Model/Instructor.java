package com.example.demo.Model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Instructor {
	@Id
	private String id;
	private String lastname;
	private String firstmidname;
	private String hireDate;
	
	@ManyToMany
	@JoinTable(name="instructor_course",joinColumns = {@JoinColumn(name="instructor_id",referencedColumnName = "id")},
			inverseJoinColumns = {@JoinColumn(name="course_id",referencedColumnName = "courseid")})
	
	private List<Course> courses;
	
	@OneToOne(mappedBy = "instructor")
	private OfficeAssignment officeassignment;
	
	@OneToMany(mappedBy = "instructor")
	private List<Department> departments;
	
	public Instructor() {
		
	}

	public Instructor(String id, String lastname, String firstmidname, String hireDate, List<Course> courses,
			OfficeAssignment officeassignment, List<Department> departments) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstmidname = firstmidname;
		this.hireDate = hireDate;
		this.courses = courses;
		this.officeassignment = officeassignment;
		this.departments = departments;
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

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public OfficeAssignment getOfficeassignment() {
		return officeassignment;
	}

	public void setOfficeassignment(OfficeAssignment officeassignment) {
		this.officeassignment = officeassignment;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
	
	
	
}
