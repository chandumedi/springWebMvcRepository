package com.apps.BO;

public class Employee {
	protected String name;
	protected int empNimber;
	protected String designation;
	protected String level;

	public Employee(String name, int empNimber, String designation, String level) {
		super();
		this.name = name;
		this.empNimber = empNimber;
		this.designation = designation;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNimber() {
		return empNimber;
	}

	public void setEmpNimber(int empNimber) {
		this.empNimber = empNimber;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
}
