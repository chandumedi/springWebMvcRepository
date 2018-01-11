package com.abstractcommand.command;

public class ProductCommand {
  private String product;
  private String category;
  private String brand;
  private float minBudget;
  private float maxBudget;
  
  public ProductCommand() {
	  System.out.println("inside command object class constructor");
}
@Override
public String toString() {
	return "ProductCommand [product=" + product + ", category=" + category + ", brand=" + brand + ", minBudget="
			+ minBudget + ", maxBudget=" + maxBudget + "]";
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public float getMinBudget() {
	return minBudget;
}
public void setMinBudget(float minBudget) {
	this.minBudget = minBudget;
}
public float getMaxBudget() {
	return maxBudget;
}
public void setMaxBudget(float maxBudget) {
	this.maxBudget = maxBudget;
}
  
}
