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

import com.practice.exercise.Model.Drug;
import com.practice.exercise.Repo.DrugRepo;

@RestController
@RequestMapping("/drug")
public class DrugController {
	@Autowired
	private DrugRepo drugrepo;
	
	@GetMapping
	public List<Drug>getAll(){
		return drugrepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Drug get(@PathVariable("id") String id) {
		return drugrepo.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Drug drug) {
		drugrepo.save(drug);
	}
	
	@PutMapping
	public void update(@RequestBody Drug drug) {
		drugrepo.save(drug);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		drugrepo.deleteById(id);
	}
}
