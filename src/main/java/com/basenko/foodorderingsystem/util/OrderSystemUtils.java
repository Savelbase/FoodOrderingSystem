package com.basenko.foodorderingsystem.util;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class OrderSystemUtils {
    static Scanner scanner = new Scanner(System.in);

    public int printInRange(int length) {
        int x = 0;
        do {
            System.out.println("Enter correct number : ");
            try {
                x = Integer.parseInt(scanner.next());
            }catch (Exception ignored){
            }
        } while (!(x > 0 && x <= length));
        return x;
    }
}
