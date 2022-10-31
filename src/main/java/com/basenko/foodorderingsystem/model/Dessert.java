package com.basenko.foodorderingsystem.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "dessert")
public class Dessert extends Food{
    @Id
    @GeneratedValue
    private Long id;

}
