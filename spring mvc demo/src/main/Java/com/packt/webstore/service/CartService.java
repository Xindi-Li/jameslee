package com.packt.webstore.service;

import com.packt.webstore.domain.Cart;

/**
 * Created by lixindi on 2017/1/3.
 */
public interface CartService {
    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);

    Cart validate(String cartId);
}
