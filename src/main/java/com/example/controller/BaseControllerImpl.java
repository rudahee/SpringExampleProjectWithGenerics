package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.entity.BaseEntity;
import com.example.service.AbstractPersistenceService;

public abstract class BaseControllerImpl<T extends BaseEntity, S extends AbstractPersistenceService<T, Integer>> implements
	BaseController<T, Integer> {

	@Autowired
	protected S service;
	

	@GetMapping("/all")
	public ResponseEntity<?> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(this.service.findAll());
	}
	
	@PostMapping("")
	public ResponseEntity<?> save(T entity) {
		return ResponseEntity.status(HttpStatus.OK).body(this.service.save(entity));
	}
}
