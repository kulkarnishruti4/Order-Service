package com.studying.orders.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studying.orders.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, String>{

	List<Orders> findAllByUserId(String userId);

}
