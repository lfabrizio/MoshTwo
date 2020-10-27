package com.fabrizio;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Textbox textBox1 = new Textbox(); //new instance of the textbox class
        textBox1.setText("sample text");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new Textbox();
        textBox2.setText("Box 2");
        System.out.println();
    }
}

