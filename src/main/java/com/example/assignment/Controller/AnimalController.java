// AnimalController.java
package com.example.assignment.Controller;

import com.example.assignment.Model.Animal;
import com.example.assignment.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }
    // Register a new animal
    @PostMapping
    public String registerAnimal(@RequestBody Animal animal) {
        animalRepository.addAnimal(animal);
        return "Animal registered successfully";
    }
    // Get animal by ID
    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable int id) {
        return animalRepository.getAnimalById(id);
    }
    // Get animals by arrival date
    @GetMapping("/byDate/{date}")
    public List<Animal> getAnimalsByDate(@PathVariable String date) {
        // Implement logic to filter animals by arrival date (dummy data)
        return animalRepository.getAnimalsByArrivalDate(date);
    }
    // Get animals by origin
    @GetMapping("/byOrigin/{origin}")
    public List<Animal> getAnimalsByOrigin(@PathVariable String origin) {
        // Implement logic to filter animals by origin (dummy data)
        return animalRepository.getAnimalsByOrigin(origin);
    }
    // Add an animal
    @PostMapping("/add")
    public String addAnimal(@RequestBody Animal animal) {
        animalRepository.addAnimal(animal);
        return "Animal added successfully";
    }
    // Delete an animal by ID
    @DeleteMapping("/delete/{id}")
    public String deleteAnimal(@PathVariable int id) {
        boolean removed = animalRepository.removeAnimalById(id);
        if (removed) {
            return "Animal deleted successfully";
        } else {
            return "Animal not found";
        }
    }
    // Get a list of all animals
    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalRepository.getAllAnimals();
    }
}
