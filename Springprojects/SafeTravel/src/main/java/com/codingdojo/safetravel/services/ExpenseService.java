package com.codingdojo.safetravel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.safetravel.models.Expense;
import com.codingdojo.safetravel.repos.ExpenseRepo;

@Service
public class ExpenseService {
@Autowired
private ExpenseRepo expenseRepo;

//========== Create / Update ===============

public Expense save(Expense s) {
	return expenseRepo.save(s);
}
//========== Read ==========================
public List<Expense>getAll(){
	return expenseRepo.findAll();
}

public Expense getOne(Long id) {
	Optional<Expense> optExp = expenseRepo.findById(id);
	
	if (optExp.isPresent()) {
		return optExp.get();
	} else {
		return null;
	}
}
//========== Delete ========================

	public void delete(Long id) {
		expenseRepo.deleteById(id);
	}
}
