package com.capgemini.shoppingapp.service.impl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.shoppingapp.entity.LineItem;
import com.capgemini.shoppingapp.entity.Order;
import com.capgemini.shoppingapp.exceptions.OrderNotFoundException;
import com.capgemini.shoppingapp.repository.OrderRepository;
import com.capgemini.shoppingapp.service.ShoppingAppService;
@Service
public class ShoppingAppServiceImpl implements ShoppingAppService {

	@Autowired
	private OrderRepository orderRepository;
	
	private HashMap<Integer, Set<LineItem>> cart = new HashMap<>();

	
	@Override
	public void addLineItem(LineItem lineItem, int customerId) {
		Set<LineItem> tempSet = cart.get(customerId);
		if (tempSet == null) {
			tempSet = new HashSet<>();
			tempSet.add(lineItem);
			cart.put(customerId, tempSet);
		} else {
			tempSet.add(lineItem);
			cart.put(customerId, tempSet);
		}
	}

	@Override
	public void removeLineItem(LineItem lineItem, int customerId) {
		Set<LineItem> tempSet = cart.get(customerId);
		if (tempSet != null) {
			tempSet.remove(lineItem);
			cart.put(customerId, tempSet);
		}

		
	}


	@Override
	public Set<LineItem> getAllLineItems(int customerId) {
		Set<LineItem> tempSet = cart.get(customerId);
		return tempSet;
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.find();
	}

	@Override
	public Order getOrder(int OrderId) throws OrderNotFoundException{
		Optional<Order> optionalOrder = orderRepository.findById(OrderId);
		if(optionalOrder.isPresent())
			return optionalOrder.get();
		throw new OrderNotFoundException("The Requested Order cannot be found");
	}

	@Override
	public Order submitOrder(Order order) {
		order.setOrderDate(LocalDate.now());
		order.setStatus("OrderInProcess");
		return orderRepository.save(order);
		
		
	}

	@Override
	public void deleteOrder(int orderId) {
		Order order = getOrder(orderId);
		order.setStatus("OrderDeleted");
		orderRepository.save(order);
		
	}

	@Override
	public void cancelOrder(int orderId) {
		Order order = getOrder(orderId);
		order.setStatus("OrderCancelled");
		orderRepository.save(order);
		
		
	}



	
	
	
}
