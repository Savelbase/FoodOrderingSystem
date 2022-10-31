package com.basenko.foodorderingsystem.service;


import com.basenko.foodorderingsystem.handler.OrderHandler;
import com.basenko.foodorderingsystem.model.Cuisines;
import com.basenko.foodorderingsystem.model.Drink;
import com.basenko.foodorderingsystem.model.Food;
import com.basenko.foodorderingsystem.util.FoodSystemMenu;
import com.basenko.foodorderingsystem.util.OrderSystemUtils;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Data
@RequiredArgsConstructor
@Component
public class MainService {
    private List<Food> order = new ArrayList<>();
    private final OrderHandler orderHandler;
    private final OrderSystemUtils utils;


    @PostConstruct
    public void main() {

        System.out.println("Do you want create order ? 1 - YES , 2 - NO");
        if (utils.printInRange(2) == 1) {
            makeOrder();
        }
    }

    public void makeOrder() {
        int choose = 0;
        do {
            FoodSystemMenu.getList();
            System.out.println("what type of food you want to choose ?");
            choose = utils.printInRange(FoodSystemMenu.values().length);
            switch (FoodSystemMenu.values()[choose - 1]) {
                case CHOOSE_LUNCH:
                    chooseLunch();
                    break;
                case CHOOSE_DRINK:
                    Drink drink = orderHandler.chooseDrink();
                    order.add(drink);
                    break;
            }
            System.out.println("Do you want to add something ? 1 - YES , 2 - NO");
            choose = utils.printInRange(2);
        } while (choose == 1);
        System.out.println("Cost : " + calculateTheCost() + "$");
    }

    private void chooseLunch() {
        Cuisines cuisines = orderHandler.chooseCuisines();
        System.out.println("Do you want to order main course ? 1 - YES , 2 - NO");
        if (utils.printInRange(2) == 1) {
            order.add(orderHandler.chooseMainCourse(cuisines));
        }
        System.out.println("Do you want to order dessert ? 1 - YES , 2 - NO");
        if (utils.printInRange(2) == 1) {
            order.add(orderHandler.chooseDessert(cuisines));
        }
    }

    private long calculateTheCost() {
        AtomicLong cost = new AtomicLong();
        if (order.isEmpty()) return 0;
        order.forEach(o -> {
            cost.addAndGet(o.getPrice());
        });
        return cost.get();
    }

}
