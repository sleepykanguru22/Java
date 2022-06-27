package com.codingdojo.superherodemo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.superherodemo.models.SideKick;

@Repository
public interface SideKickRepo extends CrudRepository<SideKick, Long> {
	List<SideKick> findAll();
}
