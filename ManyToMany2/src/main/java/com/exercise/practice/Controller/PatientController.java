package com.exercise.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.practice.Model.Patient;
import com.exercise.practice.Repo.PatientRepo;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientRepo patrepo;
	
	@GetMapping
	public List<Patient>getAll(){
		return patrepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Patient get(@PathVariable("id") String id){
		return 	patrepo.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Patient patient) {
		patrepo.save(patient);
	}
	
	@PutMapping
	public void update(@RequestBody Patient patient) {
		patrepo.save(patient);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id){
			patrepo.deleteById(id);
	}
}
