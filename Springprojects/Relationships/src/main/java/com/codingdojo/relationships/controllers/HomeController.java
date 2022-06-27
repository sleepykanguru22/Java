package com.codingdojo.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.relationships.models.License;
import com.codingdojo.relationships.models.Person;
import com.codingdojo.relationships.services.LicenseService;
import com.codingdojo.relationships.services.PersonService;
@Controller
public class HomeController {
	@Autowired
	private PersonService personService;
	@Autowired
	private  LicenseService licenseService;
	
	@RequestMapping("/home")
	public String home() {
		return "showPerson.jsp";
	}
	
	@GetMapping("/persons/{person_id}")
	public String showPerson(@PathVariable Long person_id, Model model) {
	    
	    Person someAwesomePerson = personService.find(person_id);
	    model.addAttribute("person", someAwesomePerson);
	    
	    return "showPerson.jsp";
	}
	
	@PostMapping("/licenses")
	public String licenses(@Valid @ModelAttribute("license") License license) {
	    // error handling with binding result omitted    
	    licenseService.create(license); // Already has the person!
	        
	    return "redirect:/persons";
	}
}
