package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Course;
@Repository
public interface CourseRepo extends JpaRepository<Course,String> {

}
