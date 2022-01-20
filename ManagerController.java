package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.Model.Projectmanager;
import com.example.demo.Repo.ManagerRepo;
import com.example.demo.Service.ManagerService;

@RestController
@RequestMapping("/manager")
public class ManagerController {
	@Autowired
	private ManagerService service;
	
	@GetMapping
	public ResponseEntity<List<Projectmanager>>getAll(){
		List<Projectmanager>managers=service.getMangers();
		return new ResponseEntity<List<Projectmanager>>(managers,HttpStatus.FOUND);
	}
	
	@GetMapping("/name")
	public ResponseEntity<List<Projectmanager>>getByName(@PathVariable("Name") String Name){
		List<Projectmanager>managers=service.getByName(Name);
		return new ResponseEntity<List<Projectmanager>>(managers,HttpStatus.FOUND);
	}
	
}
