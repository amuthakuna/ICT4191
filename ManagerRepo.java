package com.example.demo.Repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Projectmanager;
@Repository
public interface ManagerRepo extends JpaRepository<Projectmanager, String>{
	@Query("select m from Projectmanager m where name like %?1%")
	public List<Projectmanager> searchByName(String Name);
}


