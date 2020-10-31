package com.fabrizio;

import com.fabrizio.mortgagecalc.UIControl;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    var control = new UIControl(true);
    var textBox = new Textbox();
    show(textBox);
    }

    public static void show(UIControl control){
        System.out.println(control);
    }

}

