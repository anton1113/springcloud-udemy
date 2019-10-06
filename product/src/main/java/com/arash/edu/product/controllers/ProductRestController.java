package com.arash.edu.product.controllers;

import com.arash.edu.product.model.Product;
import com.arash.edu.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/productapi")
public class ProductRestController {

    private final ProductRepository productRepository;

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
