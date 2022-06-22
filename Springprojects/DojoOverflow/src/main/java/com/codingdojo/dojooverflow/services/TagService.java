package com.codingdojo.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojooverflow.models.Question;
import com.codingdojo.dojooverflow.models.Tag;
import com.codingdojo.dojooverflow.repos.TagRepo;

@Service
public class TagService {
private final TagRepo tagRepo;
	
	public TagService(TagRepo tagRepo) {
		this.tagRepo = tagRepo;
	}
	
	public List<Tag> allTags(){
		return tagRepo.findAll();
	}
	
	public List<Tag> getAssignedQuestions(Question question){
		return tagRepo.findAllByQuestions(question);
	}
	
	public List<Tag> getUnassignedQuestions(Question question){
		return tagRepo.findByQuestionsNotContains(question);
	}
	
	public Tag findById(Long id) {
		Optional<Tag> optionalTag = tagRepo.findById(id);
		if(optionalTag.isPresent()) {
			return optionalTag.get();
		}else {
			return null;
		}
	}
	
	public Tag findBySubject(String subject) {
		return tagRepo.findBySubjectIs(subject);
	}
	
	public Tag addTag(Tag tag) {
		return tagRepo.save(tag);
	}
	
	public Tag updateTag(Tag tag) {
		return tagRepo.save(tag);
	}
	
	public void deleteTag(Tag tag) {
		tagRepo.delete(tag);
	}
}
