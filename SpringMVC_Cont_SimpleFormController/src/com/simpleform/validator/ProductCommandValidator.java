package com.simpleform.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.simpleform.command.ProductCommand;

public class ProductCommandValidator implements Validator {
   public ProductCommandValidator() {
	   System.out.println("inside the validator class constructor");
}

@Override
public boolean supports(Class<?> classType) {
	System.out.println("inside supports method of validator class");
	return classType.isAssignableFrom(ProductCommand.class);
}

@Override
public void validate(Object command, Errors errors) {
	System.out.println("inside validate method of validator class");
	ProductCommand productCommand = (ProductCommand)command;
	if(productCommand.getProduct() == null | productCommand.getProduct().length() ==0 ) {
		errors.rejectValue("product", "product.required");
	}else if(productCommand.getBrand() == null | productCommand.getBrand().length() ==0) {
		errors.rejectValue("brand", "brand.required");
	}else if(productCommand.getCategory() == null | productCommand.getCategory().length() ==0) {
		errors.rejectValue("category", "category.required");
	}else if(productCommand.getMinBudget() <=0.0) {
		errors.rejectValue("minBudget", "minBudget.required");
	}	
}
   
}
