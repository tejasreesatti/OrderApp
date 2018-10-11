package com.capgemini.shoppingapp.entity;

import org.springframework.data.annotation.Id;


public class LineItem {
	@Id
	private int lineItemId;
	private int quantity;
	private int productId;
	
	public LineItem(int lineItemId, int quantity, int productId) {
		super();
		this.lineItemId = lineItemId;
		this.quantity = quantity;
		this.productId = productId;
	}

	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(int lineItemId) {
		this.lineItemId = lineItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "LineItems [lineItemId=" + lineItemId + ", quantity=" + quantity + ", productId=" + productId + "]";
	}
	
	
}
