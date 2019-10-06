package com.arash.edu.price.repository;

import com.arash.edu.price.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, String> {
}
