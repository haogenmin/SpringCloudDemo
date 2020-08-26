package com.haogenmin.provider1.mapper;

import com.haogenmin.model.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper //或者在启动类上标识 @MapperScan
public interface ProductMapper {

    @Select("select pid, product_name, db_source from product where pid=#{pid}")
    Product findById(Long pid);

    @Select("select pid, product_name, db_source from product")
    List<Product> findAll();

    @Options(useGeneratedKeys = true, keyProperty = "pid")
    @Insert("INSERT INTO product(product_name, db_source) VALUES(#{productName}, DATABASE())")
    boolean addProduct(Product product);
}