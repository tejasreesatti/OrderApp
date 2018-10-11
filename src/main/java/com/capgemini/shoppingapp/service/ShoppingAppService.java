package com.capgemini.shoppingapp.service;

import java.util.List;
import java.util.Set;

import com.capgemini.shoppingapp.entity.LineItem;
import com.capgemini.shoppingapp.entity.Order;

public interface ShoppingAppService {

	public Set<Order> getAllOrders();
	
	public Order getOrder(int OrderId);
	
	public Order submitOrder(Order order);
/*	
	public void updateOrder(Order order);*/
	
	public void deleteOrder(int orderId);
	
	public void cancelOrder(int orderId);
	
	public void addLineItem(LineItem lineItem,int customerId);
	
	public void removeLineItem(LineItem lineItem, int customerId);
	
	public Set<LineItem> getAllLineItems(int customerId);
	
	
}
