package com.example.assignment.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDate dateDelivered;
    private String origin;
    private double weight;

    public Animal() {
    }

    public Animal(int id, LocalDate dateDelivered, String origin, double weight) {
        this.id = id;
        this.dateDelivered = dateDelivered;
        this.origin = origin;
        this.weight = weight;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateDelivered() {
        return dateDelivered;
    }

    public void setDateDelivered(LocalDate dateDelivered) {
        this.dateDelivered = dateDelivered;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
