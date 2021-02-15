package com.rajni.task.service;

import org.springframework.stereotype.Service;

import com.rajni.task.NumberEntity;
import com.rajni.task.repository.NumberRepository;

@Service
public class TaskService implements ITaskService {

	private final NumberRepository numberRepository;

	public TaskService(NumberRepository numberRepository) {
		super();
		this.numberRepository = numberRepository;
	}
	
	NumberEntity number =new NumberEntity();
	
	@Override
	public synchronized void incrementNumberByOne() {
		
		number.setCount(number.getCount() +1);
		numberRepository.save(number);
	}
	
}
