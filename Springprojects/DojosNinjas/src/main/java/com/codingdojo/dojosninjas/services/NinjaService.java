package com.codingdojo.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.codingdojo.dojosninjas.models.Ninja;
import com.codingdojo.dojosninjas.repos.NinjaRepo;

public class NinjaService {
@Autowired
private NinjaRepo ninjaRepo;

public Ninja save(Ninja s) {
	return ninjaRepo.save(s);
}
public List<Ninja>getAll(){
	return ninjaRepo.findAll();
}
public Ninja getOne(Long id) {
	Optional<Ninja> optNinja = ninjaRepo.findById(id);
	if(optNinja.isPresent()) {
		return optNinja.get();}
	else {
		return null;}
	}

public void delete(Long id) {
	ninjaRepo.deleteById(id);}
}
