package com.basenko.foodorderingsystem;

import lombok.RequiredArgsConstructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class FoodOrderingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodOrderingSystemApplication.class, args);
    }

}
