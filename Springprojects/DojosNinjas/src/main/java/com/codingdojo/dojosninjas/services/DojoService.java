package com.codingdojo.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.codingdojo.dojosninjas.models.Dojo;
import com.codingdojo.dojosninjas.repos.DNRepo;

public class DojoService {
@Autowired
private DNRepo dojoRepo;


public DojoService() {

}
//create
public Dojo save(Dojo s) {
	return dojoRepo.save(s);
}
//read all
public List<Dojo>getAll(){
	return dojoRepo.findAll();
}
//read one
public Dojo getOne(Long id) {
	Optional <Dojo> optDojo = dojoRepo.findById(id);
	if(optDojo.isPresent()) {
		return optDojo.get();}
	else {
			return null;}
}
//update


//delete
public void delete(Long id) {
	dojoRepo.deleteById(id);
}
}
