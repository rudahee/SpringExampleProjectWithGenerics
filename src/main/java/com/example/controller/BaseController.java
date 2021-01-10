package com.example.controller;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.model.entity.BaseEntity;

public interface BaseController<T extends BaseEntity, ID extends Serializable> {
	
	public ResponseEntity<?> getAll();
	public ResponseEntity<?> save(@RequestBody T entity);
}
