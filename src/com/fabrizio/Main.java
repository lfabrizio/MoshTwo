package com.fabrizio;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int baseSalary = 50_000;
    int extraHours = 10;
    int hourlyRate = 20;
    int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);

    }

    public static int calculateWage( int baseSalary, int extraHours, int hourlyRate){
       return baseSalary + (extraHours * hourlyRate);
    }
}

