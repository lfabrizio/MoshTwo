package com.fabrizio.mortgagecalc;

import java.text.NumberFormat;
import java.util.Scanner;


    public class Mortgage {

        public static void main(String[] args) {
            // mortgage calculator
            // 0.005 interest rate
            // n = 180
            byte monthsInYear = 12;
            final byte percent = 100;
            int principal = 0;

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Principle: ");
                principal = scanner.nextByte();
                if (principal >= 1000 && principal <= 1_000_000)
                    break;
                System.out.println("Enter a value between 1000 and 1000000");
            }
            while (true) {
                System.out.print("Annual Interest rate : ");
                float annualInterest = scanner.nextFloat();
                float monthlyInterest = annualInterest / percent / monthsInYear;
            }
            //  System.out.println("(Period)(years):");
            //   byte years = scanner.nextByte();
            // int numberOfPayments = years * monthsInYear;

            //  double mortgage  = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            //        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

//            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(numberOfPayments);
//            System.out.println("Mortgage: " + mortgageFormatted);
//        }
        }}


