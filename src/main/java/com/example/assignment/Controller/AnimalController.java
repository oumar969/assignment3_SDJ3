package com.example.assignment.Controller;

import com.example.assignment.Model.Animal;
import com.example.assignment.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {
    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/animals")
    public String getAllAnimals() {
        return animalRepository.getAnimals().toString();
    }

    @PostMapping
    public void registerAnimal(@RequestBody Animal animal) {
        animalRepository.addAnimal(animal);
    }

    @GetMapping("animals/byId/{id}")
    public Animal getAnimal(@PathVariable int id) {
        return animalRepository.getAnimal(id);
    }

    @GetMapping("animals/byDate/{date}")
    public List<Animal> getAnimalsByDate(@PathVariable String date) {
        return animalRepository.getAllAnimalsByDate(date);
    }

    @GetMapping("animals/byOrigin/{origin}")
    public List<Animal> getAnimalsByOrigin(@PathVariable String origin) {
        return animalRepository.getAllAnimalsByLocation(origin);
    }
}
