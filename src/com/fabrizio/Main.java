package com.fabrizio;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // mortgage calc

        // 0.005 interest rate
        // n = 180
        byte monthsInYear = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principal = scanner.nextByte();

        System.out.print("Annual Interest rate : ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/percent/monthsInYear;

        System.out.println("(Period)(years):");
        byte years = scanner.nextByte();
        int numberOfPayments = years * monthsInYear;

        double mortgage  = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(numberOfPayments);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
