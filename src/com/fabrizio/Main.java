package com.fabrizio;

import com.fabrizio.mortgagecalc.UIControl;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    UIControl[] controls = { new Textbox(), new CheckBox()};
    for (var control : controls)
        control.render()
}}

