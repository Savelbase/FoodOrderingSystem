package com.basenko.foodorderingsystem.model;

import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class Food {
    String name;
    Long price;
    @Enumerated(EnumType.STRING)
    Cuisines cuisines ;
}
