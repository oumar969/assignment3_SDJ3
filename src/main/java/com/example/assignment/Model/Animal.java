package com.example.assignment.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String animalType;
    private LocalDate dateOfBirth;

    private double weight;
    @ManyToMany
    private List<Product> products;

    public Animal() {
    }

    public Animal(int id, String animalType) {
        this.id = id;
        this.animalType = animalType;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && Objects.equals(animalType, animal.animalType) && Objects.equals(products, animal.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, animalType, products);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animalType='" + animalType + '\'' +
                ", products=" + products +
                '}';
    }
}