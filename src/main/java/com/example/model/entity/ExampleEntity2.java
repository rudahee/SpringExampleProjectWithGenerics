package com.example.model.entity;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class ExampleEntity2 extends BaseEntity {
	
	private String title;
	private Integer number;
		
	public ExampleEntity2() {
		super();
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
	
}