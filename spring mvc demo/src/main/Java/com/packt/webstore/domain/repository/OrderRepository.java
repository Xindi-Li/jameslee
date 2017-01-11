package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Order;

/**
 * Created by lixindi on 2017/1/5.
 */
public interface OrderRepository {
    Long saveOrder(Order order);
}
