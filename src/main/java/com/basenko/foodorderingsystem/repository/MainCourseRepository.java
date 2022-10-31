package com.basenko.foodorderingsystem.repository;



import com.basenko.foodorderingsystem.model.Cuisines;
import com.basenko.foodorderingsystem.model.Dessert;
import com.basenko.foodorderingsystem.model.MainCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MainCourseRepository extends JpaRepository<MainCourse , Long> {
    List<MainCourse> findByCuisines (Cuisines cuisines);
}
