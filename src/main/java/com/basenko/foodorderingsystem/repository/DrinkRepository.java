package com.basenko.foodorderingsystem.repository;

import com.basenko.foodorderingsystem.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink , Long> {
}
