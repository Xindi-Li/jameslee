package com.packt.webstore.exception;

/**
 * Created by lixindi on 2016/12/26.
 */
public class ProductNotFoundException extends RuntimeException {
    private static final long serialVersionUID =-694354952032299587L;
    private String productId;
    public ProductNotFoundException(String productId) {
        this.productId = productId;
    }
    public String getProductId() {
        return productId;
    }
}
