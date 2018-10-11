package com.capgemini.shoppingapp.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capgemini.shoppingapp.entity.Order;

public interface OrderRepository extends MongoRepository<Order, Integer>{

	
	@Query ("{status : {$ne : 'OrderDeleted'}}")
	public List<Order> find();
}
