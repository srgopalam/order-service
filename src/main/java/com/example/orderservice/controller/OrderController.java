package com.example.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.dto.OrderPayload;
import com.example.orderservice.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("${app.endpoint.processOrder}")
	public OrderPayload processOrder(@RequestBody OrderPayload orderPayload) {
		return orderService.processOrder(orderPayload);
	}
}