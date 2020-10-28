package com.fabrizio;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();

        employee.setHourlyRate(50_000);
        employee.setBaseSalary(20);
       int wage = employee.calculateWage(10);
        System.out.println(wage);


    }

}

