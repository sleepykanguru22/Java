package com.codingdojo.joybundle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.joybundle.models.Name;
import com.codingdojo.joybundle.models.User;
import com.codingdojo.joybundle.repos.NameRepo;

@Service
public class NameService {
	private final NameRepo nameRepo;
	
	public NameService(NameRepo nameRepo) {
		this.nameRepo = nameRepo;
	}
	
	public List<Name> allNames(){
		return nameRepo.findAll();
	}
	
	public Name updateName(Name name) {
		return nameRepo.save(name);
	}
	
	public List<Name> getAssignedUsers(User user){
		return nameRepo.findAllByUsers(user);
	}
	
	public List<Name> getUnassignedUsers(User user){
		return nameRepo.findByUsersNotContains(user);
	}
	
	public Name addName(Name name) {
		return nameRepo.save(name);
	}
	
	public void deleteName(Name name) {
		nameRepo.delete(name);
	}
	
	public Name findById(Long id) {
		Optional<Name> optionalName = nameRepo.findById(id);
		if(optionalName.isPresent()) {
			return optionalName.get();
		}else {
			return null;
		}
	}
	
}
