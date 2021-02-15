package com.rajni.task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NumberEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int count = 0;

	 public void increment() {
	        count = count + 1;
	    }

	
	public Long getId() {
		return id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	public NumberEntity() {
		super();
	}
	
	
	
}
