package com.codingdojo.dojosninjasthree.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosninjasthree.models.Ninja;
import com.codingdojo.dojosninjasthree.repos.NinjaRepo;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepo ninjaRepo;
	
	// create
	public Ninja createNinja(Ninja n) {
        return ninjaRepo.save(n);
    }
	//get all
	public List<Ninja> allNinjas() {
        return ninjaRepo.findAll();
    }
	// get one
	public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
	// delete
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}
}
