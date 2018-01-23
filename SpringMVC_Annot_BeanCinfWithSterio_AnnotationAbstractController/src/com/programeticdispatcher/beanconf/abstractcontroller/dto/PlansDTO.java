package com.programeticdispatcher.beanconf.abstractcontroller.dto;

public class PlansDTO {
  private String planName;
  private int amountToBalance;
  private int validity;
  private int amountWillGet;
 
public PlansDTO(String planName, int amountToBalance, int validity, int amountWillGet) {
	super();
	this.planName = planName;
	this.amountToBalance = amountToBalance;
	this.validity = validity;
	this.amountWillGet = amountWillGet;
	System.out.println("inside PlansDTO class constructor");
}
public String getPlanName() {
	return planName;
}
public void setPlanName(String planName) {
	this.planName = planName;
}
public int getAmountToBalance() {
	return amountToBalance;
}
public void setAmountToBalance(int amountToBalance) {
	this.amountToBalance = amountToBalance;
}
public int getValidity() {
	return validity;
}
public void setValidity(int validity) {
	this.validity = validity;
}
public int getAmountWillGet() {
	return amountWillGet;
}
public void setAmountWillGet(int amountWillGet) {
	this.amountWillGet = amountWillGet;
}
}
