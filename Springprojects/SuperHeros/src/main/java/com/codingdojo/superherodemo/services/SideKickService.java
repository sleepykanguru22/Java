package com.codingdojo.superherodemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.superherodemo.models.SideKick;
import com.codingdojo.superherodemo.repos.SideKickRepo;

@Service
public class SideKickService {
	@Autowired
	private SideKickRepo sideKickRepo;
	
	// ========== Create / Update ===============

	public SideKick save(SideKick s) {
		return sideKickRepo.save(s);
	}

	// ========== Read ==========================

	public List<SideKick> getAll() {
		return sideKickRepo.findAll();
	}
	
	public SideKick getOne(Long id) {
		Optional<SideKick> s = sideKickRepo.findById(id);
		
		if (s.isPresent()) {
			return s.get();
		} else {
			return null;
		}
	}

	// ========== Delete ========================
	
	public void delete(Long id) {
		sideKickRepo.deleteById(id);
	}
}
