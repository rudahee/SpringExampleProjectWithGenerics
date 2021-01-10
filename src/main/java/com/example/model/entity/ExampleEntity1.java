package com.example.model.entity;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class ExampleEntity1 extends BaseEntity {
	
	private String name;
	private Integer age;
		
	public ExampleEntity1() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
}
