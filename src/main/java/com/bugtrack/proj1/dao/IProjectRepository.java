package com.bugtrack.proj1.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bugtrack.proj1.entities.ProjectEntity;

public interface IProjectRepository extends CrudRepository<ProjectEntity, Long> {

	@Override
	public List<ProjectEntity> findAll();
}
