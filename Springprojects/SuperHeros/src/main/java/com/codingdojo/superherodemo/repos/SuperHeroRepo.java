package com.codingdojo.superherodemo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.superherodemo.models.SuperHero;

@Repository
public interface SuperHeroRepo extends CrudRepository<SuperHero, Long> {
	List<SuperHero> findAll();
}