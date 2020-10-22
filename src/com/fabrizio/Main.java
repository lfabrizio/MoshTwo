package com.fabrizio;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // while loop

        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")){
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        }
    }

