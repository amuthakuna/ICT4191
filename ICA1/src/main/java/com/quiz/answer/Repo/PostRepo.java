package com.quiz.answer.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.answer.Model.Post;

public interface PostRepo extends JpaRepository<Post, Long>{

}
