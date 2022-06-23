package com.codingdojo.joybundle.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.joybundle.models.Task;

@Repository
public interface TaskRepo extends CrudRepository<Task, Long> {
	List<Task> findAll();
	List<Task> findByNameIdIs(Long id);
}
