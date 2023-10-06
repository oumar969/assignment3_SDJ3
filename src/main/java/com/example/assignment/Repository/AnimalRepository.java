package com.example.assignment.Repository;

import com.example.assignment.Model.Animal;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@Repository
public class AnimalRepository {
    private static final ArrayList<Animal> animals = new ArrayList<>();
    private static AnimalRepository instance;

    public static AnimalRepository getInstance() {
        if (instance == null) {
            instance = new AnimalRepository();
            addAnimal(new Animal(23, LocalDate.of(2022, 5, 4), "Boston"));
            addAnimal(new Animal(24, LocalDate.of(2022, 5, 4), "Horsens"));
            addAnimal(new Animal(25, LocalDate.of(2022, 5, 4), "Aarhus"));
            addAnimal(new Animal(26, LocalDate.of(2022, 5, 4), "Ciocana"));
            addAnimal(new Animal(27, LocalDate.of(2022, 5, 4), "Chisinau"));
        }
        return instance;
    }

    private AnimalRepository() {
    }

    public static void addAnimal(Animal animal) {
        animals.add(animal);
        animals.get(animals.indexOf(animal)).setId(animals.indexOf(animal));
    }

    public Animal getAnimal(int id) {
        return animals.get(id);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public ArrayList<Animal> getAllAnimalsByDate(String date) {
        ArrayList<Animal> x = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getDateDelivered().equals(date)) {
                x.add(animal);
            }
        }
        return x;
    }

    public ArrayList<Animal> getAllAnimalsByLocation(String location) {
        ArrayList<Animal> x = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getOrigin().equals(location)) {
                x.add(animal);
            }
        }
        return x;
    }
}
