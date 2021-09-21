package com.quiz.answer.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.answer.Model.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long>{

}
