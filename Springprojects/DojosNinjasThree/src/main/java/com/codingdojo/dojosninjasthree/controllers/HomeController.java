package com.codingdojo.dojosninjasthree.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosninjasthree.models.Dojo;
import com.codingdojo.dojosninjasthree.services.DojoService;

@Controller
public class HomeController {
//service imports
	@Autowired
	private DojoService dojoService;
//home route
	@GetMapping("/")
	public String home() {
		return "redirect:/dashboard";
	}
//dojo dashboard route
	
	@GetMapping("/dashboard")
	public String Dojo(Model model) {
		model.addAttribute("dojo", dojoService.allDojos());
		
		return "dashboard.jsp";
	}
	
	@GetMapping("/dojo/{id}")
	public String DojoInfo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.findDojo(id));
		
		return "dashboard.jsp";
	}
	
	//add new dojo location
	@GetMapping("/dojo/add")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {	
		return "addDojo.jsp";
	}
	
	@PostMapping("/dojo/save")
	public String saveDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if	(result.hasErrors()) {
			return "addDojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			
			return "redirect:/dashboard";
		}
	}
	

	
}
