package com.codingdojo.beltattempt.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.beltattempt.models.TVShow;

@Repository
public interface TVShowRepo extends CrudRepository<TVShow, Long>{
	List<TVShow>findAll();
}
