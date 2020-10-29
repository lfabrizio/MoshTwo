package com.fabrizio;

import com.fabrizio.mortgagecalc.UIControl;

public class Textbox extends UIControl {
    private String text; // field

    public void setText(String text){
         this.text = text; // ref to current object
    }

    public void clear(){
        text = "";
    }
}
