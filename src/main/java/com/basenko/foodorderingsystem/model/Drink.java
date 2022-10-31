package com.basenko.foodorderingsystem.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "drink")
public class Drink extends Food {
    @Id
    @GeneratedValue
    private Long id;
}
