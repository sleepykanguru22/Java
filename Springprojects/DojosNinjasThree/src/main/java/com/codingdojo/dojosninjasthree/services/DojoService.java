package com.codingdojo.dojosninjasthree.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosninjasthree.models.Dojo;
import com.codingdojo.dojosninjasthree.repos.DojoRepo;

@Service
public class DojoService {
	@Autowired
	private DojoRepo dojoRepo;
	
//	create
	 public Dojo createDojo(Dojo b) {
	        return dojoRepo.save(b);
	    }	
	
// get all
	public List<Dojo> allDojos() {
        return dojoRepo.findAll();
    }
	
// get one
	public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
	
// delete	
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}
}
