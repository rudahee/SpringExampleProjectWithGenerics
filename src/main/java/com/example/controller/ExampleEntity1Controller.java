package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.entity.ExampleEntity1;
import com.example.service.ExampleEntity1Service;

@RestController
@RequestMapping(value = "1")
public class ExampleEntity1Controller extends BaseControllerImpl<ExampleEntity1, ExampleEntity1Service> {
	
	@GetMapping("/example")
	public ResponseEntity<?> example() {
		this.service.exampleMethodOnlyForEntity1();
		return ResponseEntity.status(HttpStatus.OK).body("ok");
	}
}
