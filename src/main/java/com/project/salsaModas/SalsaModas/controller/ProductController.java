package com.project.salsaModas.SalsaModas.controller;

import com.project.salsaModas.SalsaModas.entities.Product;
import com.project.salsaModas.SalsaModas.services.ProductSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductSerice productSerice;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> a = productSerice.findAll();
        return ResponseEntity.ok().body(a);
    }

}
