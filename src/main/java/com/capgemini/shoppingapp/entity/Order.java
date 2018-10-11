package com.capgemini.shoppingapp.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
	@Id
	private int orderId;
	private double orderTotal;
	private LocalDate orderDate;
	private int customerId;
	private Set<LineItem> lineitem;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, double orderTotal, LocalDate orderDate, int customerId, Set<LineItem> lineitem) {
		super();
		this.orderId = orderId;
		this.orderTotal = orderTotal;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.lineitem = lineitem;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Set<LineItem> getLineitem() {
		return lineitem;
	}
	public void setLineitem(Set<LineItem> lineitem) {
		this.lineitem = lineitem;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderTotal=" + orderTotal + ", orderDate=" + orderDate + ", customerId="
				+ customerId + ", lineitem=" + lineitem + "]";
	}
	
	
	
	
}
