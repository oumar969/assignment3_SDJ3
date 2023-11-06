package com.example.assignment.Model;

import java.time.LocalDate;

public class AnimalDTO {

    private String animalType;
    private LocalDate dateOfBirth;

    private double weight;

    public AnimalDTO(String animalType, LocalDate dateOfBirth, double weight) {
        this.animalType = animalType;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "AnimalDTO{" +
                "animalType='" + animalType + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", weight=" + weight +
                '}';
    }
}
