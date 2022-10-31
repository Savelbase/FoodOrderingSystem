package com.basenko.foodorderingsystem.util;


public enum FoodSystemMenu {
    CHOOSE_LUNCH("Lunch"),
    CHOOSE_DRINK("Drink");

    private final String foodName;

    FoodSystemMenu(String foodName) {
        this.foodName = foodName;
    }

    public static void getList() {
        for (FoodSystemMenu foodSystemMenu : FoodSystemMenu.values()) {
            System.out.println(foodSystemMenu.ordinal() + 1 + " - " + foodSystemMenu.foodName.toLowerCase());
        }
    }
}
