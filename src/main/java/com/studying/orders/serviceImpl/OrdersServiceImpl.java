package com.studying.orders.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.studying.orders.entity.Orders;
import com.studying.orders.repository.OrdersRepository;
import com.studying.orders.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService{
	
	@Autowired
	OrdersRepository repo;
	
	Logger logger = LoggerFactory.getLogger(OrdersServiceImpl.class);
	
	RestTemplate restTemplate;
	
	public List<Orders> getAllOrdersByUserId (String userId) {
		
		return repo.findAllByUserId(userId);

	}
}
