package com.packt.webstore.service;

import com.packt.webstore.domain.Order;

/**
 * Created by lixindi on 2016/12/12.
 */
public interface OrderService {
    void processOrder(String productId, long count);
    Long saveOrder(Order order);
}
