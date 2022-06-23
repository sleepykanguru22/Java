package com.codingdojo.joybundle.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.joybundle.models.Name;
import com.codingdojo.joybundle.models.User;

@Repository
public interface NameRepo extends CrudRepository<Name, Long> {
	List<Name> findAll();
	Name findByIdIs(Long id);
	List<Name> findAllByUsers(User user);
	List<Name> findByUsersNotContains(User user);
}