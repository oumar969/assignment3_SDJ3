package com.example.assignment.Service;

import com.example.assignment.Model.Animal;
import com.example.assignment.Model.AnimalDTO;
import com.example.assignment.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class AnimalServiceImp implements AnimalService{

    @Autowired
    AnimalRepository animalRepository;

    @Override
    public Animal create(AnimalDTO dto) {

        Animal animalObject = new Animal(0,dto.getAnimalType());
        return animalRepository.save(animalObject);
    }

    @Override
    public List<Animal> findAll() {

        List<Animal> animals = new ArrayList<>();
        animalRepository.findAll().forEach(animals::add);
        return animals;
    }

    @Override
    public Optional<Animal> findById(int id) {

        return animalRepository.findById(id);
    }

    @Override
    public List<Animal> findByDate(int day, int month, int year) {

        LocalDate date = LocalDate.of(year, month, day);
        return animalRepository.findAnimalsByDate(date);
    }

    @Override
    public List<Animal> findByFarm(String farm) {
        return animalRepository.findAnimalsByFarm(farm);
    }
}