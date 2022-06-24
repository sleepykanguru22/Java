package com.codingdojo.safetravel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.codingdojo.safetravel.models.Expense;
import com.codingdojo.safetravel.services.ExpenseService;

@Controller
public class MainController {
	
	@Autowired
	private ExpenseService expenseService;
		
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.getAll();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	
	@PostMapping("/expenses")
	public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.getAll();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}else {
			expenseService.save(expense);
			return "redirect:/expenses";
		}
	}
}
