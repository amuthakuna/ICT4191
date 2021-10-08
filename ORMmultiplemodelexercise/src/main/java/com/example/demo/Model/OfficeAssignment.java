package com.example.demo.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OfficeAssignment {
	@Id
	@GeneratedValue
	private long id;
	private String location;
	
	@OneToOne
	@JoinColumn(name="instructor_id",referencedColumnName = "id")
	private Instructor instructor;
	
	public OfficeAssignment() {
		
	}

	public OfficeAssignment(long id, String location, Instructor instructor) {
		super();
		this.id = id;
		this.location = location;
		this.instructor = instructor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
	
}
