package com.web.boot.bo;

public class TodoBO {
	protected String taskName;
	protected String doerName;
	protected int targatedDays;
	
	public TodoBO(String taskName, String doerName, int targatedDays) {
		super();
		this.taskName = taskName;
		this.doerName = doerName;
		this.targatedDays = targatedDays;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDoerName() {
		return doerName;
	}
	public void setDoerName(String doerName) {
		this.doerName = doerName;
	}
	public int getTargatedDays() {
		return targatedDays;
	}
	public void setTargatedDays(int targatedDays) {
		this.targatedDays = targatedDays;
	}
	
	
}
