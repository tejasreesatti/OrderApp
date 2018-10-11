package com.capgemini.shoppingapp.exceptions;

public class OrderNotFoundException extends RuntimeException {

	public OrderNotFoundException (String message) {
		super(message);
	}
}
