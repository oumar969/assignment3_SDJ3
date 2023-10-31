package com.example.assignment.Service;

import com.example.assignment.Model.Animal;
import com.example.assignment.Model.AnimalDTO;

import java.util.List;
import java.util.Optional;

public class AnimalServiceImp implements AnimalService{
    @Override
    public Animal create(AnimalDTO animal) {
        return null;
    }

    @Override
    public List<Animal> findAll() {
        return null;
    }

    @Override
    public Optional<Animal> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Animal> findByDate(int day, int month, int year) {
        return null;
    }

    @Override
    public List<Animal> findByFarm(String farm) {
        return null;
    }
}
