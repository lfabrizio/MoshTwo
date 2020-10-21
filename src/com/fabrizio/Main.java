package com.fabrizio;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // switch statements
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("you're an admin");
                break;
            case "moderator":
                System.out.println("you're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
    }
}
