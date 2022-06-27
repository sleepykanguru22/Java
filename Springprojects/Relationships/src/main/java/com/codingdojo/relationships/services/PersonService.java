package com.codingdojo.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.relationships.models.Person;
import com.codingdojo.relationships.repos.PersonRepo;

@Service
public class PersonService {
	@Autowired 
	private PersonRepo personRepo;
	
	 public List<Person> allPersons() {
	        return personRepo.findAll();
	    }
	   
	    public Person create(Person b) {
	        return personRepo.save(b);
	    }
	   
	    public Person find(Long id) {
	        Optional<Person> optionalPerson = personRepo.findById(id);
	        if(optionalPerson.isPresent()) {
	            return optionalPerson.get();
	        } else {
	            return null;
	        }
	    }
	
}
