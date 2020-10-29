package com.fabrizio.mortgagecalc;


import java.util.Scanner;

public class Console {
    // when we call readNumber it will create a new instance of the Scanner class
    // use this class when wanting tot read A value from the console
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Please enter a value between " + min + " and " + max);
        }
        return value;
    }
}