package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by lixindi on 2016/12/12.
 */
public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(String productID);
    List<Product> getProductsByCategory(String category);
    List <Product> getProductsByManufacturer(String manufacturer);
    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
    void addProduct(Product product);
}
