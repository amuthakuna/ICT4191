package com.example.demo.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Enrollment {
	@Id
	private String enrollmentid;
	private String grade;
	
	@ManyToOne
	@JoinColumn(name="course_id",referencedColumnName = "courseid")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="student_id",referencedColumnName = "id")
	private Student student;
	
	public Enrollment() {
		
	}

	public Enrollment(String enrollmentid, String grade, Course course, Student student) {
		super();
		this.enrollmentid = enrollmentid;
		this.grade = grade;
		this.course = course;
		this.student = student;
	}

	public String getEnrollmentid() {
		return enrollmentid;
	}

	public void setEnrollmentid(String enrollmentid) {
		this.enrollmentid = enrollmentid;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
	
}
