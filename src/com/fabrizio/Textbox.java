package com.fabrizio;

public class Textbox {
    public String text; // field

    public void setText(String text){
         this.text = text; // ref to current object
    }

    public void clear(){
        text = "";
    }
}
