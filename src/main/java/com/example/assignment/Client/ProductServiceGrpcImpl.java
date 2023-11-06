package com.example.assignment.Client;

import com.example.assignment.Service.ProductService;
import org.example.ProductServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class ProductServiceGrpcImpl extends ProductServiceGrpc.ProductServiceImplBase {

    @Autowired
    private ProductService service;

    public ProductServiceGrpcImpl() {
        service = SpringContext.getBean(ProductService.class);
    }


}
