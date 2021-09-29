package com.practice.exercise.Controller;

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

import com.practice.exercise.Model.Pharmacy;
import com.practice.exercise.Repo.PharRepo;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {
	@Autowired
	private PharRepo pharrepo;
	
	@GetMapping
	public List<Pharmacy>getAll(){
		return pharrepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Pharmacy get(@PathVariable("id") String id) {
		return pharrepo.findById(id).get();
	}
	
	@PostMapping
	public void  add(@RequestBody Pharmacy pharmacy) {
		pharrepo.save(pharmacy);
	}
	
	@PutMapping
	public void  update(@RequestBody Pharmacy pharmacy) {
		pharrepo.save(pharmacy);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		pharrepo.deleteById(id);
	}
	
	

}
