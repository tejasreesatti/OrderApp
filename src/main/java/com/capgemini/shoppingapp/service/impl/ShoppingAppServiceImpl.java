package com.capgemini.shoppingapp.service.impl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.shoppingapp.entity.LineItem;
import com.capgemini.shoppingapp.entity.Order;
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
	public Set<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrder(int OrderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order submitOrder(Order order) {
		/*Order order = new Order();
		order.setCustomerId(customerId);
		order.setOrderDate(LocalDate.now());
		order.setOrderTotal(1000);
		order.setLineitem(cart.get(customerId));*/
		return orderRepository.save(order);
		
	}

	@Override
	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelOrder(int orderId) {
		// TODO Auto-generated method stub
		
	}



	
	
	
}
