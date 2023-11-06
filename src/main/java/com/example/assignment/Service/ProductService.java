package com.example.assignment.Service;

import com.example.assignment.Model.Animal;
import com.example.assignment.Model.AnimalDTO;
import com.example.assignment.Model.Product;

import java.util.List;

public interface ProductService {

    public Product makeProductHalfAnimal(AnimalDTO dto);
    public List<Product> getAllProductsWithAnimalRegNum(int regNum);

    List<Animal> getAllAnimalsInAProduct(int productId);
}
