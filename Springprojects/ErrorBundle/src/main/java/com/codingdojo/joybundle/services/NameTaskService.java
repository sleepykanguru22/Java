package com.codingdojo.joybundle.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.joybundle.models.Task;
import com.codingdojo.joybundle.repos.TaskRepo;

@Service
public class NameTaskService {
	private final TaskRepo taskRepo;
	
	public NameTaskService(TaskRepo taskRepo) {
		this.taskRepo = taskRepo;
	}
	
	public List<Task> allTasks(){
		return taskRepo.findAll();
	}
	
	public List<Task> nameTasks(Long nameId){
		return taskRepo.findByNameIdIs(nameId);
	}
	
	public Task addTask(Task task) {
		return taskRepo.save(task);
	}
	
	public void deleteTask(Task task) {
		taskRepo.delete(task);
	}
}
