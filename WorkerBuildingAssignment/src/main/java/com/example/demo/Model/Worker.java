package com.example.demo.Model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.Entity;
@Entity
public class Worker {
	@Id
	private String Worker_id;
	private String WorkerName;
	private double HourlyRate;
	
	enum SkillType{
		Electric,
		Plumbing,
		Roofing,
		Framing
	}
	@Enumerated(EnumType.STRING)
	private SkillType SkillType;
	
	@ManyToOne
	@JoinColumn(name = "supervisor_id",referencedColumnName = "Worker_id")
	private Worker Supervisor;
	/*@OneToMany(mappedBy = "Supervisor")
	private List<Worker>workers;*/
	
	@OneToMany(mappedBy = "worker")
	private List<Assignment>WorkAssignments;
	
	public Worker() {
		
	}

	public Worker(String worker_id, String workerName, double hourlyRate,
			com.example.demo.Model.Worker.SkillType skillType, Worker supervisor, List<Assignment> workAssignments) {
		super();
		Worker_id = worker_id;
		WorkerName = workerName;
		HourlyRate = hourlyRate;
		SkillType = skillType;
		Supervisor = supervisor;
		WorkAssignments = workAssignments;
	}

	public String getWorker_id() {
		return Worker_id;
	}

	public void setWorker_id(String worker_id) {
		Worker_id = worker_id;
	}

	public String getWorkerName() {
		return WorkerName;
	}

	public void setWorkerName(String workerName) {
		WorkerName = workerName;
	}

	public double getHourlyRate() {
		return HourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		HourlyRate = hourlyRate;
	}

	public SkillType getSkillType() {
		return SkillType;
	}

	public void setSkillType(SkillType skillType) {
		SkillType = skillType;
	}

	public Worker getSupervisor() {
		return Supervisor;
	}

	public void setSupervisor(Worker supervisor) {
		Supervisor = supervisor;
	}

	public List<Assignment> getWorkAssignments() {
		return WorkAssignments;
	}

	public void setWorkAssignments(List<Assignment> workAssignments) {
		WorkAssignments = workAssignments;
	}
	
	
}
