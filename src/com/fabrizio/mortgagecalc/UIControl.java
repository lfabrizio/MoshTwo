package com.fabrizio.mortgagecalc;

public abstract class UIControl {
    private boolean isEnabled = true;

//    public UIControl(boolean isEnabled){
//        this.isEnabled = isEnabled;
//        System.out.println("Ui control");
//    }

    public abstract void render();

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
