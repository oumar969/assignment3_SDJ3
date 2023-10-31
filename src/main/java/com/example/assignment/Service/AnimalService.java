package com.example.assignment.Service;

import com.example.assignment.Model.Animal;
import com.example.assignment.Model.AnimalDTO;

import java.util.List;
import java.util.Optional;

public interface AnimalService {
    Animal create(AnimalDTO animal);
    List<Animal> findAll();
    Optional<Animal> findById(int id);
    List<Animal> findByDate(int day, int month, int year);
    List<Animal> findByFarm(String farm);
}
