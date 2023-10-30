package com.example.assignment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

public class Product {
    @Id
    private int id;
    private String productName;
    @ManyToMany
    private List<Animal> animalsInProduct;

    public Product(int id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public Product() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Animal> getAnimalsInProduct() {
        return animalsInProduct;
    }

    public void setAnimalsInProduct(List<Animal> animalsInProduct) {
        this.animalsInProduct = animalsInProduct;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
