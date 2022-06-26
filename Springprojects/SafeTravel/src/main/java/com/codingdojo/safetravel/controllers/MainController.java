package com.codingdojo.safetravel.controllers;

import java.util.List;

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
	
//	edit and update
	 @GetMapping("/edit/{id}")
	    public String edit(@PathVariable("id") Long id, Model model) {
	        Expense expense = expenseService.getOne(id);
	        model.addAttribute("expense", expense);
	        return "edit.jsp";
	    }
	  @PutMapping("/edit/{id}")
	    public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
	        if (result.hasErrors()) {
	            return "edit.jsp";
	        } else {
	            expenseService.save(expense);
	            return "redirect:/expenses";
	        }
	    }
	  //delete
	  @DeleteMapping("/expenses/{id}")
	    public String destroy(@PathVariable("id") Long id) {
	        expenseService.delete(id);
	        return "redirect:/expenses";
	    }
	  //show
	  @GetMapping("/expense/{id}")
		public String showExpense(@PathVariable("id") Long id, Model model) {
			Expense expense = expenseService.getOne(id);
			model.addAttribute("expense", expense);
			return "show.jsp";
		}
		
}
