package com.practice.exercise.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.exercise.Model.Drug;
@Repository
public interface DrugRepo extends JpaRepository<Drug, String> {

}
