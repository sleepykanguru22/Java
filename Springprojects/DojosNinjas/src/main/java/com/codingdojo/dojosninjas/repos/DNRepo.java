package com.codingdojo.dojosninjas.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojosninjas.models.Dojo;

@Repository
public interface DNRepo extends CrudRepository<Dojo, Long> {
	List<Dojo>findAll();
}
