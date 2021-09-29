package com.practice.exercise.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
 
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Pharmacy {
	@Id
	private String Pharid;
	private String Name;
	private String Address;
	
	@ManyToMany
	@JoinTable(name="phar_drug",joinColumns = {@JoinColumn(name="phar_id",referencedColumnName = "Pharid")},inverseJoinColumns = {@JoinColumn(name="drug_id",referencedColumnName = "DrugId")})
	private List<Drug>drugs=new ArrayList<Drug>();
	
	public Pharmacy() {
		
	}

	public Pharmacy(String pharid, String name, String address, List<Drug> drugs) {
		super();
		Pharid = pharid;
		Name = name;
		Address = address;
		this.drugs = drugs;
	}

	public String getPharid() {
		return Pharid;
	}

	public void setPharid(String pharid) {
		Pharid = pharid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	@JsonIgnore
	public List<Drug> getDrugs() {
		return drugs;
	}

	public void setDrugs(List<Drug> drugs) {
		this.drugs = drugs;
	}
	
	
}
