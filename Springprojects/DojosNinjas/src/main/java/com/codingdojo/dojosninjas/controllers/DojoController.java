package com.codingdojo.dojosninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.dojosninjas.services.DojoService;

@Controller
public class DojoController {

	
	public class dojoApi {
	    private final DojoService dojoService;
	    public void dojosApi(DojoService dojoService){
	        this.dojoService = dojoService;
	    }	
		
	@GetMapping("/")
	public String Index() {
		return "redirect/index.jsp";
	}
	@GetMapping("/dojo")
	public String dojo(Model model) {
		model.addAttribute("dojo", dojoService.getAll());
		return "NewDojo.jsp";
	}
}
