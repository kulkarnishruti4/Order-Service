package com.studying.orders.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studying.orders.entity.Orders;
import com.studying.orders.service.OrdersService;

@RestController
@RequestMapping("/oders")
public class OrdersController {
	
	@Autowired
	private OrdersService service;
	
	@GetMapping("/getAllOrdersByUserId/{userId}")
	public List<Orders> getAllOrdersByUserId (@PathVariable String userId) {
		
		return service.getAllOrdersByUserId(userId);
		
	}
	

}
