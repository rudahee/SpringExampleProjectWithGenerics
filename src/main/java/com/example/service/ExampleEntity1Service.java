package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.entity.ExampleEntity1;
import com.example.model.repository.BaseRepository;

@Service
public class ExampleEntity1Service extends AbstractPersistenceService<ExampleEntity1, Integer> implements IExEntity1{

	

	
	public ExampleEntity1Service(BaseRepository<ExampleEntity1, Integer> baseRepository) {
		super(baseRepository);
	}


	@Override
	public void exampleMethodOnlyForEntity1() {
		System.out.println("This only works on entity 1 !!");
	}

}
