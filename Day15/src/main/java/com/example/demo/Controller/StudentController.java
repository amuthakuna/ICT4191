package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

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
import com.example.demo.Model.Student;
import com.example.demo.Repo.CourseRepo;
import com.example.demo.Repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentRepo context;
	
	@Autowired
	private CourseRepo context1;
	
	@GetMapping
	public List<Student>getAll(){
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Student get(@PathVariable("id") Long id) {
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Student student) {
		context.save(student);
	}
	
	@PutMapping
	public void update(@RequestBody Student student) {
		context.save(student);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		context.deleteById(id);
	}

	@PostMapping("/{id}/addcourse")
	public void addCourse(@PathVariable("id") long stuid,@RequestBody Map<Long,String>coursemap) {
		Student student=context.findById(stuid).get();
		Course course=context1.findById(coursemap.get("CourseId")).get();
		student.getCourses().add(course);
		context.save(student);
		
	}
	
}
