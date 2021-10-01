package com.exercise.practice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercise.practice.Model.Doctor;
@Repository
public interface DoctorRepo extends JpaRepository<Doctor, String> {

}
