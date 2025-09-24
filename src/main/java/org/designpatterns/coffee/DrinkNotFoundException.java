package org.designpatterns.coffee;

public class DrinkNotFoundException extends RuntimeException {
	public DrinkNotFoundException(String s) {
		super(s);
	}
}
