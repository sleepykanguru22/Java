package com.codingdojo.beltattempt.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.beltattempt.models.TVShow;
import com.codingdojo.beltattempt.models.User;
import com.codingdojo.beltattempt.services.TVShowService;
import com.codingdojo.beltattempt.services.UserService;

@Controller
public class TVShowController {
	@Autowired 
	TVShowService tvShowService;
	@Autowired 
	UserService userServ;
	
	@GetMapping("/tvshows/new")
	public String newShow(@ModelAttribute("tvshow") TVShow tvshow) {
		
		return "new.jsp";
	}
	
	@PostMapping("/tvshows/create")
	public String createShow(@Valid @ModelAttribute("tvshow") TVShow tvshow, BindingResult result, HttpSession session) {
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		
		if	(result.hasErrors()) {
			return "new.jsp";
		} else {
			
			User user = userServ.findById((Long)session.getAttribute("userId"));
			tvshow.setCreator(user);
			tvShowService.save(tvshow);
			
			return "redirect:/welcome";
		}
	}
	
	
	@GetMapping("/tvshows/{id}")
	public String showInfo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("tvshows", tvShowService.getOne(id));
		
		return "show.jsp";
	}
	
	@GetMapping("/tvshows/{id}/edit")
	public String editSuperHero(@PathVariable("id") Long id, Model model) {
		model.addAttribute("tvshows", tvShowService.getOne(id));
		
		return "edit.jsp";
	}
	
	@PutMapping("/tvshows/{id}/update")
	public String updateSuperHero(@Valid @ModelAttribute("tvshows") TVShow tvshow, BindingResult result, HttpSession session) {
		System.out.println(tvshow.getTitle());
		System.out.println(tvshow.getNetwork());
		System.out.println(tvshow.getRating());
		System.out.println(tvshow.getDescription());
		if	(result.hasErrors()) {
			return "edit.jsp";
		} else {
			tvShowService.save(tvshow);
			
			return "redirect:/welcome/";
		}
	}
	
	@DeleteMapping("/tvshows/{id}/delete")
	public String deleteShow(@PathVariable("id") Long id) {
		tvShowService.delete(id);
		
		return "redirect:/welcome";
	}
	
}
