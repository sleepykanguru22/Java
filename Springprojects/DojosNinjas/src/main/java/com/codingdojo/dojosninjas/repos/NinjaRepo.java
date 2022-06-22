package com.codingdojo.dojosninjas.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojosninjas.models.Ninja;

public interface NinjaRepo extends CrudRepository<Ninja, Long>{
	List<Ninja>findAll();

}
