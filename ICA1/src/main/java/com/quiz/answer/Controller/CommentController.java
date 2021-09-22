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

import com.quiz.answer.Model.Comment;
import com.quiz.answer.Repo.CommentRepo;

@RestController
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	CommentRepo context;
	
	@GetMapping
	public List<Comment> getAll(){
		return context.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Comment getPosts(@PathVariable("id") Long id){
		return context.findById(id).get();
	}
	
	@PostMapping
	public void add(@RequestBody Comment comment) {
		context.save(comment);
	}
	
	@PutMapping
	public void update(@RequestBody Comment comment) {
		context.save(comment);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		context.deleteById(id);
	}
}
