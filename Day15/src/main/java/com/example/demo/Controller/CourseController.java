package com.example.demo.Controller;

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

import com.example.demo.Model.Course;
import com.example.demo.Repo.CourseRepo;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseRepo repo;
	
	@GetMapping
	public List<Course>getAll(){
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Course get(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Course course) {
		repo.save(course);
	}
	
	@PutMapping
	public void update(@RequestBody Course course) {
		repo.save(course);
	}
	
	@DeleteMapping
	public void delete(@PathVariable("id") String id) {
		repo.deleteById(id);
	}
}
