package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.entity.ExampleEntity2;
import com.example.service.ExampleEntity2Service;


@RestController
@RequestMapping(value = "2")
public class ExampleEntity2Controller extends BaseControllerImpl<ExampleEntity2, ExampleEntity2Service> {
	
}
