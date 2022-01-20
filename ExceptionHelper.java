package com.example.demo.Servicehelper;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionHelper {
@ExceptionHandler(EntityNotFoundException.class)

public ResponseEntity<Object>EntityNotFoundHnadler(EntityNotFoundException ex){
	return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.NOT_FOUND);
}
}

