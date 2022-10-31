package com.basenko.foodorderingsystem.handler;

import com.basenko.foodorderingsystem.model.*;
import com.basenko.foodorderingsystem.repository.DessertRepository;
import com.basenko.foodorderingsystem.repository.DrinkRepository;
import com.basenko.foodorderingsystem.repository.MainCourseRepository;
import com.basenko.foodorderingsystem.util.OrderSystemUtils;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Data
@Component
@RequiredArgsConstructor
public class OrderHandler {
    private final MainCourseRepository mainCourseRepository;
    private final DrinkRepository drinkRepository;
    private final DessertRepository dessertRepository;
    private final OrderSystemUtils orderSystemUtils;

    public Cuisines chooseCuisines() {
        System.out.println("Choose cuisines : ");
        Cuisines.getList();
        int count = orderSystemUtils.printInRange(Cuisines.values().length);
        return Cuisines.values()[count - 1];
    }

    public MainCourse chooseMainCourse(Cuisines cuisines) {
        System.out.println("Choose the main course : ");
        List<MainCourse> mainCourseList = mainCourseRepository.findByCuisines(cuisines);
        return (MainCourse) foodMenu(mainCourseList);
    }

    public Drink chooseDrink() {
        System.out.println("Choose the drink : ");
        List<Drink> drinks = drinkRepository.findAll();
        return (Drink) foodMenu(drinks);
    }

    public Dessert chooseDessert(Cuisines cuisines) {
        System.out.println("Choose the dessert : ");
        List<Dessert> desserts = dessertRepository.findByCuisines(cuisines);
        return (Dessert) foodMenu(desserts);
    }

    public Food foodMenu (List<? extends Food> list){
        AtomicInteger counter = new AtomicInteger(0);
        list.forEach(mainCourse -> System.out.println(counter.incrementAndGet() + ". " + mainCourse.getName()
                + " - " + mainCourse.getPrice() + "$"));
        if(list.size() == 0){
            return null ;
        }
        int count = orderSystemUtils.printInRange(list.size());
        return list.get(count-1);
    }
}
