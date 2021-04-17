package com.example.orderservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderservice.dto.OrderPayload;
import com.example.orderservice.helper.OrderHelper;
import com.example.orderservice.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderHelper helper;

	@Override
	public OrderPayload processOrder(OrderPayload orderPayload) {
		return helper.processOrder(orderPayload);
	}

}
