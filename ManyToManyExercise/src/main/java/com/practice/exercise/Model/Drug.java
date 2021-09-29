package com.practice.exercise.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Drug {
	@Id
	private String DrugId;
	private String TradeName;
	private String Formulae;
	
	@ManyToMany(mappedBy = "pharmacies")
	private List<Pharmacy>pharmacies=new ArrayList<Pharmacy>();
	
	public Drug() {
		
	}

	public Drug(String drugId, String tradeName, String formulae, List<Pharmacy> pharmacies) {
		super();
		DrugId = drugId;
		TradeName = tradeName;
		Formulae = formulae;
		this.pharmacies = pharmacies;
	}

	public String getDrugId() {
		return DrugId;
	}

	public void setDrugId(String drugId) {
		DrugId = drugId;
	}

	public String getTradeName() {
		return TradeName;
	}

	public void setTradeName(String tradeName) {
		TradeName = tradeName;
	}

	public String getFormulae() {
		return Formulae;
	}

	public void setFormulae(String formulae) {
		Formulae = formulae;
	}
	@JsonIgnore
	public List<Pharmacy> getPharmacies() {
		return pharmacies;
	}

	public void setPharmacies(List<Pharmacy> pharmacies) {
		this.pharmacies = pharmacies;
	}
	
	
}
