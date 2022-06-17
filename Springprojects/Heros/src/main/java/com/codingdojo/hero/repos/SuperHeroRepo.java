package com.codingdojo.hero.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.hero.models.SuperHero;

@Repository
public interface SuperHeroRepo extends CrudRepository<SuperHero, Long> {
	List<SuperHero> findAll();
}
