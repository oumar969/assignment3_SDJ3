package com.example.assignment.Client;

import org.example.AnimalServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class AnimalServiceGrpcImpl extends AnimalServiceGrpc.AnimalServiceImplBase
{
    @Autowired
    private AnimalService service;

    public AnimalServiceGrpcImpl() {
        service = SpringContext.getBean(AnimalService.class);
    }
}
