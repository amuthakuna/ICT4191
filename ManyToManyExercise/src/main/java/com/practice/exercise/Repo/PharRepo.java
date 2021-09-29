package com.practice.exercise.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.exercise.Model.Pharmacy;
@Repository
public interface PharRepo extends JpaRepository<Pharmacy,String> {

}
