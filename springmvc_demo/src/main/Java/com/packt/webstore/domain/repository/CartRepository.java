package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Cart;

/**
 * Created by lixindi on 2017/1/3.
 */
public interface CartRepository {
    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);
}
