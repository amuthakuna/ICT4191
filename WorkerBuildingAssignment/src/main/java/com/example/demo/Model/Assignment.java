package com.example.demo.Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Assignment implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name = "worker_id",referencedColumnName = "Worker_id")
	private Worker worker;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "building_id",referencedColumnName = "Building_id")
	private Building building;
	
	private Date StartDate;
	private int NumberOfDays;
	
	public Assignment() {
		
	}

	public Assignment(Worker worker, Building building, Date startDate, int numberOfDays) {
		super();
		this.worker = worker;
		this.building = building;
		StartDate = startDate;
		NumberOfDays = numberOfDays;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public int getNumberOfDays() {
		return NumberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		NumberOfDays = numberOfDays;
	}
	
	
}
