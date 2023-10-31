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

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
