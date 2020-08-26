package com.haogenmin.consumer.controller;


import com.haogenmin.consumer.service.ProductClientService;
import com.haogenmin.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/consumer")
public class ProductController_Consumer {

    @Autowired
    private ProductClientService productClientService;

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public boolean add(Product product) {
        return productClientService.add(product);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return productClientService.get(id);
    }

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public List<Product> list() {
        return productClientService.list();
    }



}
