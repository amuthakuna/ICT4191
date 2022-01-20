package com.example.demo.Service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Projectmanager;
import com.example.demo.Repo.ManagerRepo;

@Service
public class ManagerService {
@Autowired
private ManagerRepo repo;

public List<Projectmanager>getMangers(){
	return repo.findAll();
}

public List<Projectmanager>getByName(String name){
	List<Projectmanager>managers=repo.searchByName(name);
	if(managers.isEmpty()) {
		throw new EntityNotFoundException("Managers not found!");
	}
	
	return managers;
}

}
