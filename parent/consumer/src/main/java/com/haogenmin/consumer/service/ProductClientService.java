package com.haogenmin.consumer.service;

import com.haogenmin.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author ：HaoGenmin
 * @Title :ProductClientService
 * @date ：Created in 2020/6/29 14:14
 * @description：
 */
@FeignClient(value = "microservice-provider", path = "provider")
public interface ProductClientService {
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public boolean add(Product product);

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id);

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public List<Product> list();
}
