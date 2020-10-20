package com.fabrizio;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // if statements
        int temp = 32;
        if (temp > 30) {
            System.out.println("Hot day");
            System.out.println("drink water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Nice day");
        } else {
            System.out.println("too cold");
        }
    }
}
