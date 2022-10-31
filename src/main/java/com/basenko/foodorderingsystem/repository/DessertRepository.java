package com.basenko.foodorderingsystem.repository;


import com.basenko.foodorderingsystem.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DessertRepository extends JpaRepository<Dessert, Long> {

    List<Dessert> findByCuisines (Cuisines cuisines);
}
