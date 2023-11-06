package com.example.assignment.Service;

import com.example.assignment.Model.Animal;
import com.example.assignment.Model.AnimalDTO;
import com.example.assignment.Model.Product;
import com.example.assignment.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    public ProductRepository productRepository;

    @Override
    public Product makeProductHalfAnimal(AnimalDTO dto) {
        Product product = new Product(0,dto.getAnimalType(),dto.getAnimalType());
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProductsWithAnimalRegNum(int regNum) {
        return null;
    }

    @Override
    public List<Animal> getAllAnimalsInAProduct(int productId) {
        return null;
    }
}
