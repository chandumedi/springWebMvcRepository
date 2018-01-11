package com.abstractcommand.dto;

public class Products {
private String product;
private String category;
private String brand;
public Products() {
	System.out.println("inside Products constructor DTO Class constructor");
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

}
