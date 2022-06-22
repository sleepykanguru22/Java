package com.codingdojo.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojooverflow.models.Answer;
import com.codingdojo.dojooverflow.repos.AnswerRepo;

@Service
public class AnswerService {
private final AnswerRepo answerRepo;
	
	public AnswerService (AnswerRepo answerRepo) {
		this.answerRepo = answerRepo;
	}
	
	public List<Answer> allAnswers(){
		return answerRepo.findAll();
	}
	
	public List<Answer> questionAnswers(Long questionId) {
		return answerRepo.findByQuestionIdIs(questionId);
	}
	
	public Answer addAnswer(Answer answer) {
		return answerRepo.save(answer);
	}
	
	public Answer findAnswer(Long id) {
		Optional<Answer> optionalAnswer = answerRepo.findById(id);
		if(optionalAnswer.isPresent()) {
			return optionalAnswer.get();
		}else {
			return null;
		}
	}
}

