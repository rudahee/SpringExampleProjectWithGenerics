package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.entity.ExampleEntity2;
import com.example.model.repository.BaseRepository;

@Service
public class ExampleEntity2Service extends AbstractPersistenceService<ExampleEntity2, Integer> {



	
	public ExampleEntity2Service(BaseRepository<ExampleEntity2, Integer> baseRepository) {
		super(baseRepository);
	}

	
}