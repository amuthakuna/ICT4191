package com.quiz.answer.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.answer.Model.User;

public interface UserRepo extends JpaRepository<User,String> {

}
