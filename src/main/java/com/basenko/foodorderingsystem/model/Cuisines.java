package com.basenko.foodorderingsystem.model;


import java.util.Locale;

public enum Cuisines {
    POLISH , MEXICAN , ITALIAN;


    public static void getList(){
        for(Cuisines cuisines : Cuisines.values()){
            System.out.println(cuisines.ordinal()+1 + " - " + cuisines.name().toLowerCase());
        }
    }
}
