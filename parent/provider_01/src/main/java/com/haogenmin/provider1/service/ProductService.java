package com.haogenmin.provider1.service;




import com.haogenmin.model.Product;

import java.util.List;


public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
