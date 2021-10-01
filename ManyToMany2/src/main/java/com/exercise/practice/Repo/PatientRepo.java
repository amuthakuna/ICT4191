package com.exercise.practice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercise.practice.Model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, String> {

}
