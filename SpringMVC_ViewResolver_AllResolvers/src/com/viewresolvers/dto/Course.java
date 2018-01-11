package com.viewresolvers.dto;

import java.util.Date;

public class Course {
	
	public Course() {
		System.out.println("inside constructor of Cource class");
	}
private String name;
private int id;
private Date date;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}
