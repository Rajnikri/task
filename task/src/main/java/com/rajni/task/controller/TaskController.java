package com.rajni.task.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajni.task.service.ITaskService;

@RestController
public class TaskController {
	
	private final ITaskService taskService;
	
	
	
	public TaskController(ITaskService taskService) {
		super();
		this.taskService = taskService;
	}



	@RequestMapping("/task")
	public void incrementNumber() {
		taskService.incrementNumberByOne();
	}
}
