package com.example.orderservice.service;

import com.example.orderservice.dto.OrderPayload;

public interface OrderService {

	OrderPayload processOrder(OrderPayload orderPlaced);

}
