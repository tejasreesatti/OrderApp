package com.capgemini.shoppingapp.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.HttpStatus;

import com.capgemini.shoppingapp.entity.LineItem;
import com.capgemini.shoppingapp.entity.Order;
import com.capgemini.shoppingapp.exceptions.OrderNotFoundException;

public interface ShoppingAppService {

	public List<Order> getAllOrders();
	
	public Order getOrder(int OrderId) throws OrderNotFoundException;
	
	public Order submitOrder(Order order);
/*	
	public void updateOrder(Order order);*/
	
	public void deleteOrder(int orderId);
	
	public void cancelOrder(int orderId);
	
	public void addLineItem(LineItem lineItem,int customerId);
	
	public void removeLineItem(LineItem lineItem, int customerId);
	
	public Set<LineItem> getAllLineItems(int customerId);
	
	
}
