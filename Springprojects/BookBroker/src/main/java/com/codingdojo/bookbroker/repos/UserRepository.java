package com.codingdojo.bookbroker.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.bookbroker.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
	Optional<User> findByEmail(String email);
}
