package com.springboot.examples.topic.controller;

public class Topic {
	private String id;
	private String name;
	private String descrption;
	public String getDescrption() {
		return descrption;
	}
	public Topic(String id, String name, String descrption) {
		super();
		this.id = id;
		this.name = name;
		this.descrption = descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public String getId() {
		return id;
	}
	public Topic() {
		
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
