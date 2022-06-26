package com.codingdojo.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repos.LanguageRepo;

@Service
public class LanguageService {

	@Autowired
	private LanguageRepo lanRepo;
	
	//select or list
	public List<Language> allLanguages(){
		return lanRepo.findAll();
	}	
	
	public Language oneLanguage(Long id) {
		Optional<Language> optLan = lanRepo.findById(id);
		if(optLan.isPresent()) {
			return optLan.get();
		}else {
			return null;
		}
	}
	//create & update
	public Language create(Language language) {
		return lanRepo.save(language);
	}
	
	public Language update(Language language) {
		return lanRepo.save(language);
	}
	//delete
	public void delete(Language language) {
		lanRepo.delete(language);
	}
}
