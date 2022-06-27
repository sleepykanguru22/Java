package com.codingdojo.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.relationships.models.License;
import com.codingdojo.relationships.repos.LicenseRepo;

@Service
public class LicenseService {
	@Autowired 
	private LicenseRepo licenseRepo;
	
	 public List<License> allLicense() {
	        return licenseRepo.findAll();
	    }
	   
	    public License create(License b) {
	        return licenseRepo.save(b);
	    }
	   
	    public License find(Long id) {
	        Optional<License> optionalLicense = licenseRepo.findById(id);
	        if(optionalLicense.isPresent()) {
	            return optionalLicense.get();
	        } else {
	            return null;
	        }
	    }
}
