package com.project.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int upper;

	@Override
	public void initialize(Age age) {
		// post construct work
		this.lower = age.lower();
		this.upper = age.upper();

	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		// logic
		if (age == null)
			return false;
		if (age < lower || age > upper) {
			return false;
		}
		return true;
	}

}
