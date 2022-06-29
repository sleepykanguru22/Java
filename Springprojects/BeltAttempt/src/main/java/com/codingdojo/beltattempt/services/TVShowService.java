package com.codingdojo.beltattempt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.beltattempt.models.TVShow;
import com.codingdojo.beltattempt.repos.TVShowRepo;

@Service
public class TVShowService {
	
	@Autowired
	private TVShowRepo tvshowRepo;
	
	// ========== Create / Update ===============
	
	public TVShow save(TVShow t) {
		return tvshowRepo.save(t);
	}

	// ========== Read ==========================

	public List<TVShow> getAll() {
		return tvshowRepo.findAll();
	}
	
	public TVShow getOne(Long id) {
		Optional<TVShow> optTV = tvshowRepo.findById(id);
		
		if (optTV.isPresent()) {
			return optTV.get();
		} else {
			return null;
		}
	}

	// ========== Delete ========================
	
	public void delete(Long id) {
		tvshowRepo.deleteById(id);
	}
}
