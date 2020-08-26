package com.haogenmin.provider2.controller;


import com.haogenmin.model.Product;
import com.haogenmin.provider2.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/provider")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "products", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "products/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        Product product = productService.get(id);
        //模拟异常
        if(product == null) {
            throw new RuntimeException("ID=" + id + "无效");
        }
        return product;
    }

    @RequestMapping(value = "products", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

    public Product getFallback(@PathVariable("id") Long id) {
        return new Product(id,
                "ID=" + id + "无效--@HystrixCommand",
                "无有效数据库");
    }
}
