package com.studying.orders.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ORDERS")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	
	@Id
	@Column(name="ORDER_ID")
	private String orderId;
	
	private List<String> items;
	
	private String userId;

}
