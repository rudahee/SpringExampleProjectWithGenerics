package com.example.service;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import com.example.model.entity.BaseEntity;
import com.example.model.repository.BaseRepository;


@Transactional
public abstract class AbstractPersistenceService<T extends BaseEntity, ID extends Serializable>
	implements BaseService<T, ID>{

	protected BaseRepository<T, ID> baseRepository;
	
	public AbstractPersistenceService(BaseRepository<T, ID> baseRepository) {
		this.baseRepository = baseRepository;
	}
	
	@Override
	public T find(ID entityId) {
		return baseRepository.findById(entityId).get();
	}

	@Override
	public List<T> findAll() {
		return (List<T>) baseRepository.findAll();
	}

	@Override
	public T save(T entity) {
		return baseRepository.save(entity);
	}

	@Override
	public T update(T entity, ID entityId) {
		// Save and update do the same thing
		return baseRepository.save(entity);
	}

	@Override
	public void delete(ID entityId) {
		baseRepository.deleteById(entityId);
	}

}
