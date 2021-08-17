package com.project.salsaModas.SalsaModas.services;

import com.project.salsaModas.SalsaModas.entities.Product;
import com.project.salsaModas.SalsaModas.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductSerice {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();

    }

}
