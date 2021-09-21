package com.quiz.answer.Controller;

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

import com.quiz.answer.Model.User;
import com.quiz.answer.Repo.UserRepo;


@RestController
@RequestMapping("/user")
public class UseController {
	@Autowired
	UserRepo context;
	
	@GetMapping
	public List<User> getAll(){
		return context.findAll();
	}
	
	
	@GetMapping("/{id}")
	public User get(@PathVariable("id") String id){
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody User user) {
		context.save(user);
	}
	
	@PutMapping
	public void update(@RequestBody User user) {
		context.save(user);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		context.deleteById(id);
	}
}
