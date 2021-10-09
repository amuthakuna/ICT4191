package com.example.demo.Model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.Entity;
@Entity
public class Building {
	@Id
	private String Building_id;
	private String Address;
	
	enum BuildingType{
		Office,
		Retail,
		Residence,
		Warehouse
	}
	@Enumerated(EnumType.STRING)
	private BuildingType buildingType;
	
	private int QualityLevel;
	private int Status;
	
	@OneToMany(mappedBy = "building")
	private List<Assignment>WorkerAssignments;
	
	public Building() {
		
	}

	public Building(String building_id, String address, BuildingType buildingType, int qualityLevel, int status,
			List<Assignment> workerAssignments) {
		super();
		Building_id = building_id;
		Address = address;
		this.buildingType = buildingType;
		QualityLevel = qualityLevel;
		Status = status;
		WorkerAssignments = workerAssignments;
	}

	public String getBuilding_id() {
		return Building_id;
	}

	public void setBuilding_id(String building_id) {
		Building_id = building_id;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public BuildingType getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(BuildingType buildingType) {
		this.buildingType = buildingType;
	}

	public int getQualityLevel() {
		return QualityLevel;
	}

	public void setQualityLevel(int qualityLevel) {
		QualityLevel = qualityLevel;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public List<Assignment> getWorkerAssignments() {
		return WorkerAssignments;
	}

	public void setWorkerAssignments(List<Assignment> workerAssignments) {
		WorkerAssignments = workerAssignments;
	}
	
	
}
