package com.packt.webstore.exception;

import com.mchange.v1.util.CollectionUtils;

/**
 * Created by lixindi on 2017/1/5.
 */
public class InvalidCartException extends RuntimeException {
    private static final long serialVersionUID = -5192041563033358491L;
    private String cartId;

    public InvalidCartException(String cartId) {
        this.cartId = cartId;
    }

    public String getCartId() {
        return cartId;
    }
}
