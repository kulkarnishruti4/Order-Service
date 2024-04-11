package com.studying.orders.service;

import java.util.List;

import com.studying.orders.entity.Orders;

public interface OrdersService {

	public List<Orders> getAllOrdersByUserId(String userId);

}
